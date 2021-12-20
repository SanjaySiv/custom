package de.hybris.training.facades.dealerDetail;

import de.hybris.platform.commercefacades.dealer.data.DealerData;

import java.util.List;

public interface DealerDetailsFacade {
    public List<DealerData> getAllDealers();
    public void removeDealer(String dealerName);
}
