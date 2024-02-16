package org.openpnp.machine.photon2.sheets;

import org.openpnp.machine.photon2.sheets.gui.GlobalConfigConfigurationWizard;
import org.openpnp.spi.PropertySheetHolder;

import javax.swing.*;

public class GlobalConfigPropertySheet implements PropertySheetHolder.PropertySheet {
    @Override
    public String getPropertySheetTitle() {
        return "Global Config";
    }

    @Override
    public JPanel getPropertySheetPanel() {
    	return new GlobalConfigConfigurationWizard();
    }
}
