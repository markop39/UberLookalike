package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.*;
import com.example.TaxiDriverBackend.service.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@Controller
public class DriverController {

    private DriverService driverService;
    @Autowired
    public DriverController(DriverService driverService){this.driverService = driverService;}

    @GetMapping(
            value = "/api/driver",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getAllDrivers() {

        List<Driver> driverList = Mockup.mockupDrivers();
        Map<String, Object> map = Map.of(
                "totalCount", 234,
                "results", driverList
        );
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @PostMapping(
            value = "/api/driver",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity addDriver(@RequestBody Driver driver) {
        return new ResponseEntity<>(Mockup.mockupDrivers().get(0), HttpStatus.OK);
    }
    @GetMapping(
            value = "/api/driver/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getDriver(@PathVariable String id) {

        Optional<Driver> driver = Optional.of(Mockup.mockupDrivers().get(0));

        return new ResponseEntity<>(driver, HttpStatus.OK);
    }
    @PutMapping(
            value = "/api/driver/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity updateDriver(@PathVariable String id, @RequestBody Driver driver) {
        driver.setId(Integer.parseInt(id));
        return new ResponseEntity<>(driver, HttpStatus.OK);
    }
    @GetMapping(
            value = "/api/driver/{id}/documents",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getDocuments(@PathVariable String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", Integer.parseInt(id));
        map.put("name", ":D");
        map.put("documentImage", "s29149azx");
        map.put("driverId", 15);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @PostMapping(
            value = "/api/driver/{id}/documents",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity addDocuments(@RequestBody DriverDocument dd, @PathVariable String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", Integer.parseInt(id));
        map.put("name", dd.name);
        map.put("documentImage", dd.documentImage);
        map.put("driverId", dd.driverId);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @DeleteMapping(
            value = "api/driver/document/{document-id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity deleteDocuments(@PathVariable("document-id") String id){
        return new ResponseEntity<>("Driver document deleted successfully", HttpStatus.NO_CONTENT);
    }

    @GetMapping(
            value = "/api/driver/{id}/vehicle",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getDriverVehicle(@PathVariable String id) {
        Optional<Map<String, Object>> map = Optional.of(Mockup.mockupVehicle());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @PostMapping(
            value = "/api/driver/{id}/vehicle",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity addDriverVehicle(@PathVariable String id, @RequestBody Map<String, Object> vehicle) {
        Optional<Map<String, Object>> map = Optional.of(Mockup.mockupVehicle());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @PutMapping(
            value = "/api/driver/{id}/vehicle",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity updateDriverVehicle(@PathVariable String id, @RequestBody Map<String, Object> vehicle) {
        Optional<Map<String, Object>> map = Optional.of(Mockup.mockupVehicle());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @GetMapping(
            value = "/api/driver/{id}/working-hour",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getDriverWorkingHours(@PathVariable String id) {
        Map<String, Object> map = Map.of(
                "totalCount", 2,
                "results", Mockup.mockupWorkingHours());

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @PostMapping(
            value = "/api/driver/{id}/working-hour",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity addDriverWorkingHour(@PathVariable String id) {
        return new ResponseEntity<>(Mockup.mockupWorkingHours().get(0), HttpStatus.OK);
    }

    @GetMapping(
            value = "/api/driver/{id}/ride",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getDriverRide(@PathVariable String id){
        Map<String, Object> map = Map.of(
                "totalCount", 2,
                "results", Mockup.mockupRides());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @GetMapping(
            value = "/api/driver/working-hour/{working-hour-id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getSingleDriverWorkingHour(@PathVariable("working-hour-id") String id) {
        return new ResponseEntity<>(Mockup.mockupWorkingHours().get(0), HttpStatus.OK);
    }
    @PutMapping(
            value = "/api/driver/working-hour/{working-hour-id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity updateSingleDriverWorkingHour(@PathVariable("working-hour-id") String id) {
        return new ResponseEntity<>(Mockup.mockupWorkingHours().get(0), HttpStatus.OK);
    }

}
