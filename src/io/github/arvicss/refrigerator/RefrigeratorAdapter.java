package io.github.arvicss.refrigerator;

import io.github.arvicss.target.PowerOutlet;

public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public RefrigeratorAdapter() {
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }


    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }
}
