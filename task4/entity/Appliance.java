package com.epam.hw.task4.entity;

import java.util.Objects;

public class Appliance {
    private int price;
    private int shelfLife;
    private int powerConsumption;

    public Appliance() {
    }

    public Appliance(int price) {
        this.price = price;
    }

    public Appliance(int price, int shelfLife) {
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public Appliance(int price, int shelfLife, int powerConsumption) {
        this.price = price;
        this.shelfLife = shelfLife;
        this.powerConsumption = powerConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String info() {
        return  "price=" + getPrice() +
                "| shelfLife=" + getShelfLife() +
                "| powerConsumption=" + getPowerConsumption()  + " | ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appliance)) return false;
        Appliance appliance = (Appliance) o;
        return getPrice() == appliance.getPrice() && getShelfLife() == appliance.getShelfLife() && getPowerConsumption() == appliance.getPowerConsumption();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getShelfLife(), getPowerConsumption());
    }
}
