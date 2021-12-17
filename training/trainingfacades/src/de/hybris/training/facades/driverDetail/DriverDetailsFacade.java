package de.hybris.training.facades.driverDetail;

import de.hybris.platform.commercefacades.driver.data.DriverData;

import java.util.List;

public interface DriverDetailsFacade {
    public List<DriverData>getDriverDetails(final String driverName);
    public List<DriverData>getAllDrivers();
}
