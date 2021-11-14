package com.company;

import java.util.Comparator;

public class TruckComparator implements Comparator<Truck> {
    public int compare(Truck truck1, Truck truck2){
        if(truck1.capacityInTones > truck2.capacityInTones){
            return -1;
        } else if(truck1.capacityInTones.equals(truck2.capacityInTones)){
            return 0;
        } else {return 1;}

    }
}
