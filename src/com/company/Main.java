package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.ConnectIOException;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {

        URL url = null;
        try {url = new URL("http://api.nbp.pl/api/exchangerates/rates/A/EUR");} catch (MalformedURLException e) {e.printStackTrace();}
        HttpURLConnection con = null;
        try {con = (HttpURLConnection) url.openConnection();} catch (IOException e) {e.printStackTrace();}
        try {con.setRequestMethod("GET");} catch (ProtocolException e) {e.printStackTrace();}
        try {int status = con.getResponseCode();} catch (IOException e) {e.printStackTrace();}

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        StringBuilder sb = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            sb.append(output);
        }
        System.out.println(sb);

        //JSONObject json = new JSONObject(new JSONTokener(sb.toString()));
        //json.getString("EffectiveDate");
        //json.getString("Mid");


        //------------------------------------------------------------------------//

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

        //------------------------------------------------------------------------//


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





        //------------------------------------------------------------------------//

        int[] numbers = new int[4];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 1;
        numbers[3] = 2;

        System.out.println("unsorted array");
        for (int i : numbers){
            System.out.println(i);
        }

        Arrays.sort(numbers);
        System.out.println("sorted array");
        for (int i : numbers){
            System.out.println(i);
        }

        String[] texts = new String[5];
        texts[0]="257493";
        texts[1]="Kurowa kucy";
        texts[2]="Random Bash";
        texts[3]="Dziunia";
        texts[4]="ropuch";

        System.out.println("unsorted array");
        for (String s : texts){
            System.out.println(s);
        }

        Arrays.sort(texts);
        System.out.println("sorted array");
        for (String s : texts){
            System.out.println(s);
        }

        Car[] cars = new Car[5];
        cars[0]=new Bus("Solaris","S400",2019);
        cars[1]=new Truck("Man","milenial",2021);
        cars[2]=new PersonalCar("Fiat","punto",1999);
        //cars[3]=new PersonalCar("Fiat","panda",2020);
        cars[3]=null;
        cars[4]=new FunnyCar("Gokart","gokart",2000);

        Arrays.sort(cars, new CarComparator());
        for (Car car : cars){
            if (car ==null){
                System.out.println("null");
            } else {
            System.out.println(car + " year of production " + car.yearOfProduction);
            }
        }

        Arrays.sort(cars, new CarComparator2());
        for (Car car : cars){
            if (car ==null){
                System.out.println("null");
            } else {
                System.out.println("producer: "+car.producer + ", " + "model: "+car.model);}
        }

        LinkedList<Truck> trucks = new LinkedList<>();
        trucks.add(new Truck("SCANIA","S300",2021));
        trucks.getLast().capacityInTones = 24.0;
        trucks.add(new Truck("mercedes","M200",2011));
        trucks.getLast().capacityInTones = 23.0;
        trucks.add(new Truck("Star", "200",1989));
        trucks.getLast().capacityInTones = 13.0;

        Collections.sort(trucks);
        for(Truck truck:trucks){
            System.out.println((truck));
        }

        Collections.sort(trucks, new TruckComparator());
        for (Truck truck : trucks){
                System.out.println(truck + " capacity in tones " + truck.capacityInTones);
            }

        Collections.sort(trucks,
                Comparator.nullsFirst(
                        Comparator.comparing(Truck::getCapacityInTones)));
        //creating new class in the background, sorting by specified

        trucks.sort(Comparator.nullsFirst(Comparator.comparing(Truck::getCapacityInTones)));


        }
    }

