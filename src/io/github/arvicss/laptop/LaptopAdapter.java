package io.github.arvicss.laptop;

import io.github.arvicss.target.PowerOutlet;

public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        laptop.charge();
    }
}
