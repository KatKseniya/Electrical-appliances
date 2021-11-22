package com.epam.hw.task4.entity;

import java.util.Objects;

public class MobilePhoneCharging extends Appliance{

    private String chargerType;

    public MobilePhoneCharging(int price, int shelfLife, int powerConsumption, String chargerType) {
        super(price, shelfLife, powerConsumption);
        this.chargerType = chargerType;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePhoneCharging)) return false;
        MobilePhoneCharging mobilePhoneCharging = (MobilePhoneCharging) o;
        return getChargerType().equals(mobilePhoneCharging.getChargerType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChargerType());
    }

    @Override
    public String info() {
        return super.info() + "charger Type='" + this.getChargerType() + '\'';
    }
}
