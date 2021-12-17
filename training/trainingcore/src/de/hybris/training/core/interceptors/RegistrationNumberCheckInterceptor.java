package de.hybris.training.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.training.core.model.VehicleListModel;

public class RegistrationNumberCheckInterceptor implements PrepareInterceptor {
    @Override
    public void onPrepare(Object o, InterceptorContext interceptorContext) throws InterceptorException {
        if(o instanceof VehicleListModel){
            final VehicleListModel model=(VehicleListModel) o;
            model.getVehicleRegistrationNumber();
        }
    }
}
