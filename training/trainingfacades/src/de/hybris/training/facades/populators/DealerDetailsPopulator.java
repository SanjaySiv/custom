package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.dealer.data.DealerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.VehicleDealersModel;

public class DealerDetailsPopulator implements Populator<VehicleDealersModel, DealerData> {
    @Override
    public void populate(VehicleDealersModel vehicleDealersModel, DealerData dealerData) throws ConversionException {
        dealerData.setId(vehicleDealersModel.getId());
        dealerData.setDealerName(vehicleDealersModel.getDealerName());
        dealerData.setDealerAddress(vehicleDealersModel.getDealerAddress());
    }
}
