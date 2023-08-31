package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.Driver;
import com.example.TaxiDriverBackend.model.DriverDocument;
import com.example.TaxiDriverBackend.model.DrivingAssessment;
import com.example.TaxiDriverBackend.service.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class UnregisteredUserController {

    @PostMapping(value = "/api/unregisteredUser/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity setLocation(@RequestBody DrivingAssessment drivingAssessment) {

        HashMap<String, String> map = new HashMap<>();
        map.put("estimatedTimeInMinutes", "10");
        map.put("estimatedCost", "450");

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
