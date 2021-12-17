package de.hybris.training.facades.driverDetail.impl;

import de.hybris.platform.commercefacades.driver.data.DriverData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.VehicleDriversModel;
import de.hybris.training.core.services.DriverServices;
import de.hybris.training.facades.driverDetail.DriverDetailsFacade;

import java.util.List;

public class DriverDetailsFacadeImpl implements DriverDetailsFacade {
    private DriverServices driverServices;
    private Converter<VehicleDriversModel,DriverData>driverDataConverter;

    public DriverServices getDriverServices() {
        return driverServices;
    }

    public void setDriverServices(DriverServices driverServices) {
        this.driverServices = driverServices;
    }

    public Converter<VehicleDriversModel, DriverData> getDriverDataConverter() {
        return driverDataConverter;
    }

    public void setDriverDataConverter(Converter<VehicleDriversModel, DriverData> driverDataConverter) {
        this.driverDataConverter = driverDataConverter;
    }

    @Override
    public List<DriverData> getDriverDetails(String driverName) {
        final List<VehicleDriversModel>driversModels=driverServices.getDriverDetails(driverName);
        return Converters.convertAll(driversModels,getDriverDataConverter());
    }

    @Override
    public List<DriverData> getAllDrivers() {
        final List<VehicleDriversModel>allDrivers=driverServices.getAllDrivers();
        return Converters.convertAll(allDrivers,getDriverDataConverter());
    }
}
