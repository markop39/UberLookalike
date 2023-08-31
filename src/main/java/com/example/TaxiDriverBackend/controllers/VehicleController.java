package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.GeoCoordinate;
import com.example.TaxiDriverBackend.service.interfaces.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class VehicleController {
    private VehicleService vehicleService;


    @Autowired
    public VehicleController(VehicleService vehicleService){this.vehicleService = vehicleService;}

    @PutMapping(value = "/api/vehicle/{id}/location", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity setLocation(@PathVariable String id, @RequestBody GeoCoordinate geoCoordinate) {

        vehicleService.setLocation(id, geoCoordinate);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
