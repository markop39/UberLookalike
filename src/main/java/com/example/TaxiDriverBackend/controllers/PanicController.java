package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.*;
import com.example.TaxiDriverBackend.service.interfaces.PanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

@Controller
public class PanicController {
    private PanicService panicService;
    @Autowired
    public PanicController(PanicService panicService){this.panicService = panicService;}

    @GetMapping(
            value = "/api/panic",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getPanic(){
        Map<String, Object> map = Map.of(
                "totalCount", 2,
                "results", Arrays.asList(
                        new Panic(
                                1,
                                new User(1,"Ime", "Prezime", "sanfkog", "+23578123", "email@emai.com", "address 215"),
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
                                        "ACTIVE"), LocalDateTime.of(2022, 12, 8, 10, 40), "Drunk driving"
                        ),
                        new Panic(
                                2,
                                new User(1,"Ime", "Prezime", "sanfkog", "+23578123", "email@emai.com", "address 215"),
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
                                        "PENDING"), LocalDateTime.of(2022, 12, 8, 10, 40), "Irresponsible driver"
                        )
                )
        );

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
