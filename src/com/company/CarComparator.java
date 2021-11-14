package com.company;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        if(car1==null){return 1;}
        else if(car2==null){return -1;}

        return car1.yearOfProduction.compareTo(car2.yearOfProduction);
    }
}
