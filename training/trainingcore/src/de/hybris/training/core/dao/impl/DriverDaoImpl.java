package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.training.core.dao.DriverDao;
import de.hybris.training.core.model.VehicleDriversModel;
import org.apache.log4j.Logger;

import java.util.*;

public class DriverDaoImpl extends AbstractItemDao implements DriverDao {
    private static final Logger LOGGER=Logger.getLogger(DriverDaoImpl.class);
    private static final String QUERY="SELECT {"+VehicleDriversModel.PK+"} FROM {"+VehicleDriversModel._TYPECODE+
            "} WHERE {"+VehicleDriversModel.DRIVERNAME+"}= ?driverName";
    @Override
    public List<VehicleDriversModel> getDriverDetailsByCode(String driverName) {
        ServicesUtil.validateParameterNotNull(driverName,"driver name must not be null");
        final Map<String,Object> params =new HashMap<>();
        params.put("driverName",driverName);
        LOGGER.info(getFlexibleSearchService().search(QUERY,params).getClass());
        final SearchResult<VehicleDriversModel> drivers=getFlexibleSearchService().search(QUERY,params);
        return drivers.getResult()==null? Collections.emptyList():drivers.getResult();
    }

    @Override
    public List<VehicleDriversModel> getAllDrivers() {
        final SearchResult<VehicleDriversModel> searchResult = this.search(new FlexibleSearchQuery("SELECT {pk} FROM {VehicleDrivers}"));
        return searchResult.getResult() == null ? Collections.emptyList() : searchResult.getResult();
    }
}
