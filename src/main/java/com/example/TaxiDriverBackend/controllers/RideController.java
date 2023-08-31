package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RideController {

    private List<Ride> db = Mockup.mockupRides();


    public List<Ride> getDb() {
        return db;
    }

    @PostMapping(value = "api/ride",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addRide(@RequestBody Ride ride) {
        return new ResponseEntity<>(db.get(0), HttpStatus.OK);
    }

    @GetMapping("api/ride/{id}")
    public Ride get(@PathVariable String id){
        for (Ride ride: db) {
            if (ride.getId() == Integer.parseInt(id))
                return ride;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/ride/driver/{driverId}/active")
    public List<Ride> getDriver(@PathVariable String driverId){
        List<Ride> driversActiveRides = new ArrayList<>();
        for(Ride ride: db){
            UserRef driver = ride.getDriver();
            if(Integer.parseInt(driverId) == driver.id && ( ride.getStatus() == "PENDING" || ride.getStatus() == "ACTIVE")){
                driversActiveRides.add(ride);
            }
        }
        return driversActiveRides;
    }

    @GetMapping("/api/ride/passenger/{passengerId}/active")
    public List<Ride> getPassenger(@PathVariable String passengerId){
        List<Ride> driversActiveRides = new ArrayList<>();
        for(Ride ride: db){
            List<UserRef> passengers = ride.getPassengers();
            for(UserRef passenger: passengers){
                if(Integer.parseInt(passengerId) == passenger.id && ( ride.getStatus() == "PENDING" || ride.getStatus() == "ACTIVE")){
                    driversActiveRides.add(ride);
                }
            }
        }
        return driversActiveRides;
    }

    @PutMapping("/api/ride/{id}/withdraw")
    public Ride putWithdraw(@PathVariable String id){
        for(Ride ride: db){
            if(ride.getId() == Integer.parseInt(id)) {
                ride.setStatus("CANCELED");
                return ride;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/api/ride/{id}/panic")
    public Panic putPanic(@PathVariable String id){
        for(Ride ride: db){
            if(ride.getId() == Integer.parseInt(id)) {
                ride.setStatus("CANCELED");
                User user = new User(1,"1","1", "111", "11", "1", "1");
                Panic panic = new Panic(ride.getId(), user, ride, LocalDateTime.now(), "bad music choice");
                return panic;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/api/ride/{id}/accept")
    public Ride putAccept(@PathVariable String id){
        for(Ride ride: db){
            if(ride.getId() == Integer.parseInt(id)) {
                ride.setStatus("ACCEPTED");
                return ride;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/api/ride/{id}/end")
    public Ride putEnd(@PathVariable String id){
        for(Ride ride: db){
            if(ride.getId() == Integer.parseInt(id)) {
                ride.setStatus("END");
                return ride;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/api/ride/{id}/cancel")
    public Ride putCancel(@PathVariable String id){
        for(Ride ride: db){
            if(ride.getId() == Integer.parseInt(id)) {
                ride.setStatus("CANCELLED");
                return ride;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
