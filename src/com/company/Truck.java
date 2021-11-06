package com.company;

public class Truck extends Car {

    public Human owner;

    Double capacityInTones;
    Double actualCargoWeight;
    Double drivingTimeInHours;

    public Truck(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.capacityInTones = 24.0;
        this.actualCargoWeight = 0.0;
        this.drivingTimeInHours = 0.0;
    }

    public void loadTruck(Double cargoWeight) {
        if (actualCargoWeight + cargoWeight > capacityInTones) {
            System.out.println("SORRY OVERLOADED");
        } else {
            this.actualCargoWeight += cargoWeight;
            System.out.println("We loaded " + cargoWeight + " tones");
        }
    }

    public void unloadTruck() {
        this.actualCargoWeight = 0.0;
    }

    public void drive(Double distance) {
        if (drivingTimeInHours < 10.0) {
            this.millage += distance;
            this.drivingTimeInHours += distance / 80.0;
        } else {
            System.out.println("you need to rest");
        }
    }

    @Override
    public Double getCleaningPrice() {
        return 120.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("12 wheels changed");
    }

    void rest() {
        this.drivingTimeInHours = 0.0;
    }


    @Override
    public Double getPrice() {
        return 250000.0;
    }

    @Override
    public Human getOwner() {
        return this.owner;
    }

    @Override
    public void sell(Human buyer) throws Exception {
        if (buyer.cash < this.getPrice()) {
            throw new Exception("You don't have enough cash " + buyer.firstName);

        } else {
            this.owner.cash += this.getPrice();
            buyer.cash -= this.getPrice();
            this.owner = buyer;
        }

    }
}
