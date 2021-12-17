package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.VehicleCountDAO;
import de.hybris.training.core.model.VehicleListModel;

import java.util.Collections;
import java.util.List;

public class VehicleCountDAOImpl implements VehicleCountDAO {

    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
    @Override
    public List findTotalVehicleCount() {
        final String query = "select {pk} from {VehicleList}";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query);
        searchQuery.setResultClassList(Collections.singletonList(VehicleListModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }
}
