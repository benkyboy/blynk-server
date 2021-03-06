package cc.blynk.server.core.model.widgets.outputs;

import cc.blynk.server.core.model.enums.PinMode;
import cc.blynk.server.core.model.enums.WidgetProperty;
import cc.blynk.server.core.model.widgets.OnePinReadingWidget;
import cc.blynk.server.core.model.widgets.outputs.graph.FontSize;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 21.03.15.
 */
public class Gauge extends OnePinReadingWidget {

    private String valueFormatting;

    public FontSize fontSize;

    @Override
    public PinMode getModeType() {
        return PinMode.in;
    }

    @Override
    public void setProperty(WidgetProperty property, String propertyValue) {
        switch (property) {
            case VALUE_FORMATTING :
                this.valueFormatting = propertyValue;
                break;
            default:
                super.setProperty(property, propertyValue);
                break;
        }
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
