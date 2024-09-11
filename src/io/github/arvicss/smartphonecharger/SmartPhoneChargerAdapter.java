package io.github.arvicss.smartphonecharger;

import io.github.arvicss.target.PowerOutlet;

public class SmartPhoneChargerAdapter implements PowerOutlet {
    private SmartPhoneCharger smartPhoneCharger;

    public SmartPhoneChargerAdapter() {
    }

    public SmartPhoneChargerAdapter(SmartPhoneCharger smartPhoneCharger) {
        this.smartPhoneCharger = smartPhoneCharger;
    }

    public SmartPhoneCharger getSmartPhoneCharger() {
        return smartPhoneCharger;
    }

    public void setSmartPhoneCharger(SmartPhoneCharger smartPhoneCharger) {
        this.smartPhoneCharger = smartPhoneCharger;
    }

    @Override
    public void plugIn() {
        smartPhoneCharger.chargePhone();
    }
}