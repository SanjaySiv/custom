
package de.hybris.training.backoffice.renderers;

import com.hybris.cockpitng.core.config.impl.jaxb.listview.ListColumn;
import com.hybris.cockpitng.dataaccess.facades.type.DataType;
import com.hybris.cockpitng.engine.WidgetInstanceManager;
import com.hybris.cockpitng.widgets.common.AbstractWidgetComponentRenderer;
import de.hybris.training.core.jalo.VehicleDrivers;
import de.hybris.training.core.model.VehicleDriversModel;
import org.apache.log4j.Logger;
import org.zkoss.zul.Div;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listcell;

public class TrainingIdRenderer extends AbstractWidgetComponentRenderer <Listcell, ListColumn, VehicleDriversModel>{
    private static final Logger LOG = Logger.getLogger(VehicleDrivers.class);

    @Override
    public void render(Listcell listcell, ListColumn listColumn, VehicleDriversModel vehicleDriversModel, DataType dataType,
                       WidgetInstanceManager widgetInstanceManager) {
        final Div div = new Div();
        final Label label = new Label();
        String id = vehicleDriversModel.getId();
        int i = 0;
        while (i < id.length() && id.charAt(i) == '0')
            i++;
        StringBuilder sb = new StringBuilder(id);
        sb.replace(0, i, "");
        id= sb.toString();
        label.setValue(id);
		div.appendChild(label);
		listcell.appendChild(div);
        fireComponentRendered(listcell, listColumn, vehicleDriversModel);
    }
}

