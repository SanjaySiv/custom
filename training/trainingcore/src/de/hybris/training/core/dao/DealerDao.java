package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.VehicleDealersModel;


import java.util.List;

public interface DealerDao extends Dao {
    public List<VehicleDealersModel> getAllDealers();
    public List<VehicleDealersModel> getDealer(String dealerName);
}
