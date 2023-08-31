package com.example.TaxiDriverBackend.controllers;

import com.example.TaxiDriverBackend.model.*;
import com.example.TaxiDriverBackend.service.interfaces.DriverService;
import com.example.TaxiDriverBackend.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

import static com.example.TaxiDriverBackend.controllers.Mockup.*;

@Controller
public class UserController {



    @GetMapping(
            value = "/api/user",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getUsers() {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("totalCount", 243);
        map.put("results", mockupUsers());

        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @GetMapping(
            value = "/api/user/{id}/ride",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getRides(@PathVariable String id) {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("totalCount", 243);
        map.put("results", mockupRides());

        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @GetMapping(
            value = "/api/user/{id}/message",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getMessages(@PathVariable String id) {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("totalCount", 243);
        map.put("results", mockupMessages());

        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @GetMapping(
            value = "/api/user/{id}/note",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getNotes(@PathVariable String id) {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("totalCount", 243);
        map.put("results", mockupNotes());

        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @PostMapping(
            value = "/api/user/login",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity login(@RequestBody Login login) {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("accessToken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJz");
        map.put("refreshToken", "yJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ.eyJz");

        return new ResponseEntity<>(map, HttpStatus.OK);
    }


    @PostMapping(
            value = "/api/user/{id}/message",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity sendMessage(@RequestBody Message message, @PathVariable String id) {
        return new ResponseEntity<>(mockupMessages().get(0), HttpStatus.OK);
    }


    @PostMapping(
            value = "/api/user/{id}/note",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity createNote(@RequestBody Note note, @PathVariable String id) {
        return new ResponseEntity<>(mockupNotes().get(0), HttpStatus.OK);
    }


    @PutMapping(
            value = "/api/user/{id}/block",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity blockUser(@PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(
            value = "/api/user/{id}/unblock",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity unblockUser(@PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
