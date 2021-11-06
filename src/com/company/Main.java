package com.company;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.ConnectIOException;

public class Main {
    public static void main(String[] args) {

        try {
            String sourcePath = "c:/desktop/non_existing_file.txt";
            String destinationPath = "c:/desktop/non_existing_folder/";
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath));

        }
        catch (FileSystemException e) {
            System.out.println("błąd dysku");
        } catch (ConnectIOException e) {
            System.out.println("błąd połączenia");
        } catch (IOException e) {
            System.out.println("inny błąd zapisu");
        } catch (Exception e) {
            System.out.println("jakiś inny błąd, nie mam pojęcia jaki");
        }


        PersonalCar fiat = new PersonalCar("fiat", "bravo", 2016);
        PersonalCar bmw = new PersonalCar("bmw", "X5", 2020);
        PersonalCar vw = new PersonalCar("vw", "passat", 1990);

        Truck scania = new Truck("Scania", "S230", 2021);
        scania.capacityInTones = 24.2;


        Bus solaris = new Bus("Solaris", "V200", 2021);
        solaris.capacityInPeople = 40;
        scania.loadTruck(2.0);
        scania.loadTruck(2.0);
        scania.loadTruck(2.0);
        scania.unloadTruck();

        scania.drive(1000.0);
        scania.drive(10.0);
        System.out.println("Truck millage:" + scania.millage);

        vw.drive(1000.0);
        vw.drive(10.0);
        System.out.println("VW millage:" + vw.millage);

        System.out.println(vw);
        System.out.println(scania);
        System.out.println(solaris);
        System.out.println(solaris.toString());

        CarWash superClear = new CarWash();
        superClear.washTheCar(fiat);
        superClear.washTheCar(vw);
        superClear.washTheCar(scania);
        superClear.washTheCar(solaris);

        fiat.changeWheels();
        scania.changeWheels();
        solaris.changeWheels();

        System.out.println(scania.producer);
        System.out.println(scania.toString());

        Human brotherInLaw = new Human();
        Human fatherInLaw = new Human();
        fatherInLaw.firstName="Janusz";
        Human me = new Human();
        Bike bike = new Bike();
        bike.owner = me;
        try {
            bike.sell(brotherInLaw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("some very important code");
        System.out.println("robimy razem grilla");

        scania.owner = me;
        try {
            scania.sell(fatherInLaw);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("sialalalala");


    }
}
