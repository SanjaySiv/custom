package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.VehicleDriversModel;

import java.util.List;

public interface DriverDao extends Dao {
    List<VehicleDriversModel>getDriverDetailsByCode(String driverName);
    List<VehicleDriversModel>getAllDrivers();
}
