package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.Driver;
import com.example.TaxiDriverBackend.model.Passenger;

import com.example.TaxiDriverBackend.model.Ride;
import com.example.TaxiDriverBackend.model.UserRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
public class PassengerController {

    List<Passenger> db = Arrays.asList(
            new Passenger(1, "Pera", "Peric", "2175812", "+31278951", "pera@gmail.com", "Nardognog fafsnioaf 15", "sifra123"),
            new Passenger(3, "Djura", "Djuric", "2134125", "+123231", "djura@gmail.com", "AKISDNASIGFNIOAGS 15", "lozinka")
    );

    @GetMapping("api/passenger")
    public List<Passenger> get(){

        return db;
    }

    @GetMapping("api/passenger/{id}")
    public Passenger get(@PathVariable String id){
        for (Passenger passenger: db) {
            if (passenger.getId() == Integer.parseInt(id))
                return passenger;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PutMapping("api/passenger/{id}")
    public Passenger put(Passenger changedPassenger){
        int i=0;
        for (Passenger passenger: db) {

            if (passenger.getId() == changedPassenger.getId()){
                passenger = changedPassenger;
                db.set(i, changedPassenger);
                return passenger;
            }
            i += 1;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    //@PostMapping("api/passenger")
    //public Passenger post(Passenger newPassenger){
    //    db.add(newPassenger);
    //    return newPassenger;
    //}

    @PostMapping(value = "api/passenger",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addPassenger(@RequestBody Passenger passenger) {
        return new ResponseEntity<>(db.get(0), HttpStatus.OK);
    }

    @GetMapping("api/passenger/{id}/ride")
    public List<Ride> getRides(@PathVariable String id){
        List<Ride> driversActiveRides = new ArrayList<>();
        RideController rideController = new RideController();
        for(Ride ride: rideController.getDb()){
            UserRef driver = ride.getDriver();
            if(Integer.parseInt(id) == driver.id && ( ride.getStatus() == "PENDING" || ride.getStatus() == "ACTIVE")){
                driversActiveRides.add(ride);
            }
        }
        return driversActiveRides;
    }

    @GetMapping("/api/passenger/activate/{activationId}")
    public String getAcivation(@PathVariable String activationId){
        return "Aktivacija Uspesna";
    }

}


