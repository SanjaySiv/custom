package de.hybris.training.core.services;

import de.hybris.training.core.dao.DealerDao;
import de.hybris.training.core.model.VehicleDealersModel;

import javax.annotation.Resource;
import java.util.List;

public class DealerServices {
    @Resource
    DealerDao dealerDao;

    public List<VehicleDealersModel> getAllDealers(){
        return dealerDao.getAllDealers();
    }
}
