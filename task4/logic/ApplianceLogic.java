package com.epam.hw.task4.logic;

import com.epam.hw.task4.entity.Appliance;
import com.epam.hw.task4.entity.TVset;

import java.util.ArrayList;
import java.util.List;


public class ApplianceLogic {

public List <Appliance> finsByContent (List<Appliance> appliances, String userContent) {
     List <Appliance> result = new ArrayList<Appliance>();

     for (Appliance appliance: appliances)
     {
         if (String.valueOf(appliance.getPrice()).contains(userContent) ||
                 String.valueOf(appliance.getPowerConsumption()).contains(userContent) ||
                 String.valueOf(appliance.getShelfLife()).contains(userContent))

         {
            result.add(appliance);
         }
     }

     return result;
 }

    public List <Appliance> finsByPrice (List<Appliance> appliances, int priceStart, int priceEnd)
    {
        List <Appliance> result = new ArrayList<Appliance>();

        for (Appliance appliance: appliances)
        {
            if (appliance.getPrice() >= priceStart && appliance.getPrice() <= priceEnd)
            {
                result.add(appliance);
            }
        }

        return result;
    }


public static void print (List<Appliance> appliances) {
    for (int i = 0; i < appliances.size(); i++) {
        Appliance app = appliances.get(i);
        System.out.println(app.info());
    }
    System.out.println();
}

}
