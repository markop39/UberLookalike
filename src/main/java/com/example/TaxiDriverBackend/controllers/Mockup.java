package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Mockup {
    public static List<Driver> mockupDrivers(){
        return Arrays.asList(
                new Driver(1, "Pera", "Peric", "2175812", "+31278951", "pera@gmail.com", "Nardognog fafsnioaf 15", "sifra123"),
                new Driver(3, "Djura", "Djuric", "2134125", "+123231", "djura@gmail.com", "AKISDNASIGFNIOAGS 15", "lozinka")
        );
    }
    public static Map<String, Object> mockupVehicle(){
        Map<String, Object> map = Map.of(
                "id", 123,
                "driverId", 123,
                "vehicleType", "STANDARDNO",
                "model", "VW Golf 2",
                "licenseNumber", "NS 123-AB",
                "currentLocation",  new GeoCoordinate("Buasgj 12", 12.51, 21.56126),
                "passengerSeats", 4,
                "babyTransport",true,
                "petTransport", true
        );
        return map;
    }
    public static List<Ride> mockupRides(){
        return Arrays.asList(
                new Ride(1,
                        LocalDateTime.of(2022, 12, 8, 10, 10),
                        LocalDateTime.of(2022, 12, 8, 10, 45),
                        1500,
                        new UserRef(1, "pera@gmail.com"),
                        Arrays.asList(new UserRef(5, "putnik@gmail.com")),
                        35,
                        "STANDARDNO",
                        true,
                        false,
                        null,
                        Arrays.asList(
                                new LocationsForRide(
                                        new GeoCoordinate("Adresa 1", 10, 15),
                                        new GeoCoordinate("Adresa 2", 10, 15))),
                        "PENDING"),
                new Ride(3,
                        LocalDateTime.of(2022, 12, 8, 10, 10),
                        LocalDateTime.of(2022, 12, 8, 10, 45),
                        1500,
                        new UserRef(1, "djura@gmail.com"),
                        Arrays.asList(new UserRef(5, "putnik@gmail.com"), new UserRef(7, "putnik7@gmail.com")),
                        35,
                        "KOMBI",
                        false,
                        true,
                        null,
                        Arrays.asList(
                                new LocationsForRide(
                                        new GeoCoordinate("Adresa 15", 100, 15),
                                        new GeoCoordinate("Adresa 20", 111, 20))),
                        "ACTIVE")

        );
    }
    public static List<WorkingHour> mockupWorkingHours(){
        return Arrays.asList(
                new WorkingHour(10, LocalDateTime.now(), LocalDateTime.now().plusMinutes(15)),
                new WorkingHour(11, LocalDateTime.now().plusDays(3), LocalDateTime.now().plusDays(3).plusMinutes(45)));
    }


    public static List<User> mockupUsers(){
        List<User> userList = Arrays.asList(
                new User(1,"Dusan", "Pera", "prva-slika.img", "2175812", "pera@gmail.com", "Nardognog fafsnioaf 15"),
                new User(1,"Pavle", "Djura", "druga-slika.img", "2134125", "djura@gmail.com", "AKISDNASIGFNIOAGS 15")
        );

        return userList;
    }

    public static List<Message> mockupMessages(){
        List<Message> messageList = Arrays.asList(
                new Message(1, LocalDateTime.of(2017,2,13,15,56), 1, 2, "ALLO", "STANDARD", 1),
                new Message(1, LocalDateTime.of(2017,2,13,15,56), 1, 2, "ALLO", "STANDARD", 1)

        );

        return messageList;
    }

    public static List<Note> mockupNotes(){
        List<Note> noteList = Arrays.asList(
                new Note(1, LocalDateTime.of(2017,2,13,15,56), "Aloo"),
                new Note(1, LocalDateTime.of(2017,2,13,15,56), "Aloo")
        );

        return noteList;
    }


    public static List<Review> getReviews(){
        Review r1 = new Review("1", 130, "Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi.", getPassenger());
        Review r2 = new Review("2", 120, "Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi.", getPassenger());
        Review r3 = new Review("3", 150, "Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! Bas me vozi. Super vozac! ", getPassenger());

        List<Review> reviews = new ArrayList<>();

        reviews.add(r1);
        reviews.add(r2);
        reviews.add(r3);

        return reviews;

    }

    public static Passenger getPassenger()     { return new Passenger(1, "Marko", "Markovic", "asd.jpg", "0653923123", "pejanovic.dusan@gmail.com", "Gagarin 10", "sifra");}


}
