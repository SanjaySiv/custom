package de.hybris.training.backoffice.editors.customvehiclereferenceeditor;

import com.hybris.cockpitng.editor.commonreferenceeditor.NestedObjectCreator;
import com.hybris.cockpitng.editor.defaultreferenceeditor.DefaultReferenceEditor;
import de.hybris.training.core.jalo.VehicleDrivers;
import de.hybris.training.core.model.VehicleDealersModel;
import de.hybris.training.core.model.VehicleDriversModel;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicReference;

public class CustomVehicleReferenceEditor<T> extends DefaultReferenceEditor<T> {
    @Override
    public String getStringRepresentationOfObject(T obj) {
        if (obj instanceof NestedObjectCreator) {
            NestedObjectCreator nestedObjectCreator = (NestedObjectCreator) obj;
            String typeName = this.getLabelService().getObjectLabel(StringUtils.isNotBlank(nestedObjectCreator.getUserChosenType()) ? nestedObjectCreator.getUserChosenType() : this.getTypeCode());
            return ((NestedObjectCreator) obj).getLabel(typeName);
        } else{
            AtomicReference<String> label = new AtomicReference();
            VehicleDriversModel vehicleDriversModel = (VehicleDriversModel) obj;
            this.getLabelProvider().ifPresentOrElse((provider) -> {
                label.set(provider.getLabel(obj));
            }, () -> {
                label.set(this.getLabelService().getObjectLabel(vehicleDriversModel.getDriverName()));
            });
            return (String) label.get();
        }
    }
}
