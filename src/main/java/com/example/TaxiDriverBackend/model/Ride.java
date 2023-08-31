package com.example.TaxiDriverBackend.model;

import ch.qos.logback.core.joran.sanity.Pair;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Ride {
    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int totalCost;
    private UserRef driver;

    private List<UserRef> passengers;
    private int estimatedTimeInMinutes;
    private String vehicleType;
    private Boolean babyTransport;
    private Boolean petTransport;
    private Rejection rejection;
    private List<LocationsForRide> locations;

    private String status;

    public Ride(int id, LocalDateTime startTime, LocalDateTime endTime, int totalCost, UserRef driver, List<UserRef> passengers, int estimatedTimeInMinutes, String vehicleType, Boolean babyTransport, Boolean petTransport, Rejection rejection, List<LocationsForRide> locations, String status) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalCost = totalCost;
        this.driver = driver;
        this.passengers = passengers;
        this.estimatedTimeInMinutes = estimatedTimeInMinutes;
        this.vehicleType = vehicleType;
        this.babyTransport = babyTransport;
        this.petTransport = petTransport;
        this.rejection = rejection;
        this.locations = locations;
        this.status = status;
    }

    public Ride (){}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public UserRef getDriver() {
        return driver;
    }

    public void setDriver(UserRef driver) {
        this.driver = driver;
    }

    public List<UserRef> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<UserRef> passengers) {
        this.passengers = passengers;
    }

    public int getEstimatedTimeInMinutes() {
        return estimatedTimeInMinutes;
    }

    public void setEstimatedTimeInMinutes(int estimatedTimeInMinutes) {
        this.estimatedTimeInMinutes = estimatedTimeInMinutes;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Boolean getBabyTransport() {
        return babyTransport;
    }

    public void setBabyTransport(Boolean babyTransport) {
        this.babyTransport = babyTransport;
    }

    public Boolean getPetTransport() {
        return petTransport;
    }

    public void setPetTransport(Boolean petTransport) {
        this.petTransport = petTransport;
    }

    public Rejection getRejection() {
        return rejection;
    }

    public void setRejection(Rejection rejection) {
        this.rejection = rejection;
    }

    public List<LocationsForRide> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationsForRide> locations) {
        this.locations = locations;
    }
}
