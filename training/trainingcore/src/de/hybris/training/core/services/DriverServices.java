package de.hybris.training.core.services;

import de.hybris.training.core.dao.DriverDao;
import de.hybris.training.core.model.VehicleDriversModel;

import javax.annotation.Resource;
import java.util.List;

public class DriverServices {
    @Resource
    private DriverDao driverDao;
    public List<VehicleDriversModel>getDriverDetails(final String driverName){
        return driverDao.getDriverDetailsByCode(driverName);
    }
    public List<VehicleDriversModel>getAllDrivers(){
        return driverDao.getAllDrivers();
    }
}
