package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.DealerDao;
import de.hybris.training.core.model.VehicleDealersModel;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

public class DealerDaoImpl extends AbstractItemDao implements DealerDao {
    private static final Logger LOGGER=Logger.getLogger(DealerDaoImpl.class);
    @Override
    public List<VehicleDealersModel> getAllDealers() {
        final SearchResult<VehicleDealersModel> searchResult = getFlexibleSearchService().search("SELECT {pk} FROM {VehicleDealers}");
        return searchResult.getResult() == null ? Collections.emptyList() : searchResult.getResult();
    }
}
