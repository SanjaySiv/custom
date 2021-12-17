package de.hybris.training.facades.dealerDetail.impl;

import de.hybris.platform.commercefacades.dealer.data.DealerData;
import de.hybris.platform.converters.Converters;
import de.hybris.training.core.model.VehicleDealersModel;
import de.hybris.training.core.services.DealerServices;
import de.hybris.training.facades.dealerDetail.DealerDetailsFacade;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class DealerDetailsFacadeImpl implements DealerDetailsFacade {
    private DealerServices dealerServices;
    private Converter<VehicleDealersModel,DealerData>dealerDataConverter;

    public DealerServices getDealerServices() {
        return dealerServices;
    }

    public void setDealerServices(DealerServices dealerServices) {
        this.dealerServices = dealerServices;
    }

    public Converter<VehicleDealersModel, DealerData> getDealerDataConverter() {
        return dealerDataConverter;
    }

    public void setDealerDataConverter(Converter<VehicleDealersModel, DealerData> dealerDataConverter) {
        this.dealerDataConverter = dealerDataConverter;
    }

    @Override
    public List<DealerData> getAllDealers() {
        final List<VehicleDealersModel>allDealers=dealerServices.getAllDealers();
        return Converters.convertAll(allDealers,getDealerDataConverter());
    }
}
