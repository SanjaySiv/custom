package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.driver.data.DriverData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.VehicleDriversModel;

public class DriverDetailsPopulator implements Populator<VehicleDriversModel, DriverData> {
    @Override
    public void populate(final VehicleDriversModel source, final DriverData target) throws ConversionException {
        target.setId(source.getId());
        target.setDriverName(source.getDriverName());
        target.setDriverExperience(source.getDriverExperience());
    }
}
