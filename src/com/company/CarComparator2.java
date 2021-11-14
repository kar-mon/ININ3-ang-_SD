package com.company;

import java.util.Comparator;

public class CarComparator2 implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        if(car1==null){return 1;}
        else if(car2==null){return -1;}

        if (car1.producer.equals(car2.producer)){
            return car1.model.compareTo(car2.model);
        } else{
            return car1.producer.compareTo(car2.producer);}

    }
}
