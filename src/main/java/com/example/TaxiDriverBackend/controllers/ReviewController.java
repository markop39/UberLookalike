package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.*;
import com.example.TaxiDriverBackend.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.TaxiDriverBackend.controllers.Mockup.getReviews;

@Controller
public class ReviewController {


    @GetMapping(
            value = "/api/review/vehicle/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE

    )
    public ResponseEntity getReviewsForVehicle(@PathVariable String id) {

        Map<String, Object> map = Map.of(
                "totalCount", 234,
                "results", getReviews()
        );
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping(
            value = "/api/review/driver/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE

    )
    public ResponseEntity getReviewsForDriver(@PathVariable String id) {

        Map<String, Object> map = Map.of(
                "totalCount", 234,
                "results", getReviews()
        );
        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @GetMapping(
            value = "/api/review/{rideId}",
            produces = MediaType.APPLICATION_JSON_VALUE

    )
    public ResponseEntity getReviewsForRide(@PathVariable String rideId) {

        List<Review> reviews = getReviews();


        Map<String, Object> map = Map.of(
                "vehicleReview", reviews.get(0),
                "driverReview", reviews.get(1)
        );

        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @PostMapping(
            value = "/api/review/{rideId}/vehicle/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity leaveReviewForVehicle(@RequestBody Review review, @PathVariable String id, @PathVariable String rideId) {
        return new ResponseEntity<>(getReviews().get(0), HttpStatus.OK);
    }



    @PostMapping(
            value = "/api/review/{rideId}/driver/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity leaveReviewForDriver(@RequestBody Review review, @PathVariable String id, @PathVariable String rideId) {
        return new ResponseEntity<>(getReviews().get(0), HttpStatus.OK);
    }



}

