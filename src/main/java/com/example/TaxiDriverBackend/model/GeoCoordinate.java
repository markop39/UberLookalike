package com.example.TaxiDriverBackend.model;

public class GeoCoordinate {
    public String address;
    public double latitude;
    public double longitude;

    public GeoCoordinate(String address, double latitude, double longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
