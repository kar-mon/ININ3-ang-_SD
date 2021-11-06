package com.company;

public class Bike implements Drivable, Saleable {

    public Human owner;

    @Override
    public void drive(Double distance) {
        System.out.println("great trip");
    }

    @Override
    public boolean hasDriver() {
        return true;
    }

    @Override
    public Double getVelocity() {
        return 0.0;
    }

    @Override
    public Double getPrice() {
        //połączenie do światowej giełdy rowerów
        //indeksacja o siłę nabywczą złotówki
        //przeskalowanie o amortyzację roweru
        return 765.40;
    }

    @Override
    public Human getOwner() {
        return this.owner;
    }

    @Override
    public void sell(Human buyer) throws Exception {
        if (buyer.cash < this.getPrice()) {
            throw new Exception("You don't have enough cash" + buyer.firstName);

        } else {
            this.owner.cash += this.getPrice();
            buyer.cash -= this.getPrice();
            this.owner = buyer;
        }

    }
}
