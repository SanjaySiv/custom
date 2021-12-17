
package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class RegistrationNumberPopulator extends SearchResultVariantProductPopulator {
    @Override
    public void populate(SearchResultValueData source, ProductData target) {
        super.populate(source, target);
        final Object vehicle=this.getValue(source,"vehicleRegistrationNumber");
        if(vehicle!=null){
            target.setVehicleRegistrationNumber(this.getValue(source,"vehicleRegistrationNumber").toString());
            target.setDriver(this.getValue(source,"driver").toString());
            target.setDealer(this.getValue(source,"dealer"));
        }
        else {
            target.setVehicleRegistrationNumber(null);
        }
    }
}

