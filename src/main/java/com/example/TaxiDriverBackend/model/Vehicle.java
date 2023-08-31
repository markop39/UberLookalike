package com.example.TaxiDriverBackend.model;

public class Vehicle {

    private String id;
    private Driver driver;
    private String model;
    private String vehicleType;
    private String licensePlate;
    private Integer numberOfSeats;
    private GeoCoordinate currentLocation;
    private boolean babyTransport;
    private boolean petTransport;

    public Vehicle(String id, Driver driver, String model, String vehicleType, String licensePlate, Integer numberOfSeats, GeoCoordinate currentLocation, boolean babyTransport, boolean petTransport) {
        this.id = id;
        this.driver = driver;
        this.model = model;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
        this.numberOfSeats = numberOfSeats;
        this.currentLocation = currentLocation;
        this.babyTransport = babyTransport;
        this.petTransport = petTransport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public GeoCoordinate getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(GeoCoordinate currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isBabyTransport() {
        return babyTransport;
    }

    public void setBabyTransport(boolean babyTransport) {
        this.babyTransport = babyTransport;
    }

    public boolean isPetTransport() {
        return petTransport;
    }

    public void setPetTransport(boolean petTransport) {
        this.petTransport = petTransport;
    }
}