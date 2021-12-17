package de.hybris.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfigService;
import de.hybris.platform.tx.Transaction;
import de.hybris.training.core.dao.VehicleCountDAO;
import de.hybris.training.core.model.TestProcessModel;
import de.hybris.training.core.model.VehicleCountCronJobModel;
import de.hybris.training.core.model.VehicleListModel;
import org.apache.log4j.Logger;

import java.util.List;

public class VehicleCountJob extends AbstractJobPerformable<VehicleCountCronJobModel> {
    private VehicleCountDAO vehicleCountDAO;
    private ModelService modelService;
    private FacetSearchConfigService facetSearchConfigService;
    private BusinessProcessService businessProcessService;

    private final static Logger LOG = Logger.getLogger(VehicleCountJob.class.getName());

    @Override
    public PerformResult perform(VehicleCountCronJobModel vehicleCountCronJobModel) {
        List<VehicleListModel> vehicle = vehicleCountDAO.findTotalVehicleCount();
        final TestProcessModel testProcessModel = (TestProcessModel) getBusinessProcessService()
                .createProcess("test-process-" + System.currentTimeMillis(), "test-process");
        getBusinessProcessService().startProcess(testProcessModel);
        LOG.info("***************************************");
        LOG.info("Current vehicle count is " + vehicle.size());
        LOG.info("***************************************");
        String registrationNumber;
        for (VehicleListModel vehicleModel : vehicle) {
            registrationNumber = vehicleModel.getVehicleRegistrationNumber();
            int count = 0;
            for (int i = 0; i < registrationNumber.length(); i++) {
                if (registrationNumber.charAt(i) == ' ') {
                    count++;
                    if (count == 3) {
                        StringBuilder stringBuilder = new StringBuilder(registrationNumber);
                        while ((stringBuilder.substring(i + 1)).length() != 4) {
                            stringBuilder.insert(i + 1, "0");
                        }
                        registrationNumber = stringBuilder.toString();
                        vehicleModel.setVehicleRegistrationNumber(registrationNumber);
                        modelService.save(vehicleModel);
                        break;
                    }
                }
            }
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public VehicleCountDAO getVehicleCountDAO() {
        return vehicleCountDAO;
    }

    public void setVehicleCountDAO(VehicleCountDAO vehicleCountDAO) {
        this.vehicleCountDAO = vehicleCountDAO;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public FacetSearchConfigService getFacetSearchConfigService() {
        return facetSearchConfigService;
    }

    public void setFacetSearchConfigService(FacetSearchConfigService facetSearchConfigService) {
        this.facetSearchConfigService = facetSearchConfigService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }
}
