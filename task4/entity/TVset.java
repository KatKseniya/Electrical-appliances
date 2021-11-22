package com.epam.hw.task4.entity;

import java.util.Objects;

public class TVset extends Appliance{
    private String brand;
    private int screenSize;

    public TVset(int price, int shelfLife, int powerConsumption, String brand, int screenSize) {
        super(price, shelfLife, powerConsumption);
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TVset)) return false;
        TVset tVset = (TVset) o;
        return getScreenSize() == tVset.getScreenSize() && getBrand().equals(tVset.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getScreenSize());
    }

    @Override
    public String info() {
        return super.info() +
                "brand='" + this.getBrand() + "' |" +
                " screenSize=" + this.getScreenSize();
    }

}
