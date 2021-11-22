package com.epam.hw.task4.main;

import com.epam.hw.task4.entity.Appliance;
import com.epam.hw.task4.entity.MobilePhoneCharging;
import com.epam.hw.task4.entity.TVset;
import com.epam.hw.task4.logic.ApplianceLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<Appliance>();

        appliances.add(new TVset(1000, 20, 400, "LG", 50));
        appliances.add(new TVset(200, 5, 100, "Gorizont", 40));
        appliances.add(new TVset(800, 15, 300, "Samsung", 46));
        appliances.add(new TVset(300, 10, 200, "Sony", 39));
        appliances.add(new TVset(600, 15, 250, "Samsung", 32));


        appliances.add(new MobilePhoneCharging(15, 1, 4, "USB 1.0"));
        appliances.add(new MobilePhoneCharging(25, 4, 5, "USB Type-C"));
        appliances.add(new MobilePhoneCharging(22, 3, 5, "USB Type-C"));
        appliances.add(new MobilePhoneCharging(22, 2, 4, "USB 2.0"));
        appliances.add(new MobilePhoneCharging(22, 3, 4, "USB 3.0"));


        ApplianceLogic logic = new ApplianceLogic();
        logic.print(appliances);

        List<Appliance> findAppliances = logic.finsByContent(appliances, "15");
        logic.print(findAppliances);

        findAppliances = logic.finsByPrice(appliances, 100, 700);
        logic.print(findAppliances);

    }
}
