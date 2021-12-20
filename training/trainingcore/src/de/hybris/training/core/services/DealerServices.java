package de.hybris.training.core.services;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.core.dao.DealerDao;
import de.hybris.training.core.model.VehicleDealersModel;

import javax.annotation.Resource;
import java.util.List;

public class DealerServices {
    @Resource
    DealerDao dealerDao;
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public List<VehicleDealersModel> getAllDealers(){
        return dealerDao.getAllDealers();
    }
    public void removeDealer(String dealerName){
        for(VehicleDealersModel dealer:dealerDao.getDealer(dealerName)){
            getModelService().remove(dealer);
        }
    }
}
