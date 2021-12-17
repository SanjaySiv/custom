package de.hybris.training.core.dao;

import de.hybris.training.core.model.VehicleListModel;

import java.util.List;

public interface VehicleCountDAO {
    public List<VehicleListModel> findTotalVehicleCount();
}
