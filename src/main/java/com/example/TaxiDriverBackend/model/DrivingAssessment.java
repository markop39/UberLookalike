package com.example.TaxiDriverBackend.model;

public class DrivingAssessment {
    private GeoCoordinate departure;
    private GeoCoordinate destination;
    private String vehicleType;
    private boolean babyTransport;
    private boolean petTransport;


    public DrivingAssessment(GeoCoordinate departure, GeoCoordinate destination, String vehicleType, boolean babyTransport, boolean petTransport) {
        this.departure = departure;
        this.destination = destination;
        this.vehicleType = vehicleType;
        this.babyTransport = babyTransport;
        this.petTransport = petTransport;
    }

    public GeoCoordinate getDeparture() {
        return departure;
    }

    public void setDeparture(GeoCoordinate departure) {
        this.departure = departure;
    }

    public GeoCoordinate getDestination() {
        return destination;
    }

    public void setDestination(GeoCoordinate destination) {
        this.destination = destination;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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
