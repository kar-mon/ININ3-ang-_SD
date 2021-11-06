package com.company;

public abstract class Car implements Drivable, Saleable {
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
}
