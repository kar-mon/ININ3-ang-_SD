package com.company;

public abstract class Car implements Drivable, Saleable, Comparable<Car> {
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Double millage;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }

    public void drive(Double distance){
        this.millage += distance;
    }

    public boolean hasDriver(){
        //here should be some logic
        return true;
    }

    public Double getVelocity(){
        //here should be some more code
        return 0.0;
    }

    public String toString(){
        return "Producer: " + this.producer +" model: "+ this.model;
    }

    abstract public Double getCleaningPrice();
    abstract public void changeWheels();

    public int compareTo(Car otherCar){
        if (this instanceof Truck && otherCar instanceof Truck){
            //check if this object is a truck
            return ((Truck) this).compareTo((Truck)otherCar);
            //treat the second car as if it's a truck
        }

     //   if(this.yearOfProduction > otherCar.yearOfProduction){
     //       return 1;
     //   } else if (this.yearOfProduction.equals(otherCar.yearOfProduction)){
     //       return 0;
     //   } else {
     //       return -1;

        if (this.producer.equals(otherCar.producer)){
            return this.model.compareTo(otherCar.model);
        } else{
        return this.producer.compareTo(otherCar.producer);}
        }
}
