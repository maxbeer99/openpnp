package org.openpnp.machine.photon2.sheets;

import org.openpnp.machine.photon2.PhotonFeederTwo;
import org.openpnp.machine.photon2.sheets.gui.FeederConfigurationWizard;
import org.openpnp.spi.PropertySheetHolder;

import javax.swing.*;

public class FeederPropertySheet implements PropertySheetHolder.PropertySheet {
    private final PhotonFeederTwo feeder;

    public FeederPropertySheet(PhotonFeederTwo feeder) {
        this.feeder = feeder;
    }

    @Override
    public String getPropertySheetTitle() {
        return "Feeder";
    }

    @Override
    public JPanel getPropertySheetPanel() {
        return new FeederConfigurationWizard(feeder);
    }
}
