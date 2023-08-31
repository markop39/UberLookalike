package com.example.TaxiDriverBackend.model;

public class LocationsForRide {
    public GeoCoordinate departure;
    public GeoCoordinate destination;

    public LocationsForRide(GeoCoordinate departure, GeoCoordinate destination) {
        this.departure = departure;
        this.destination = destination;
    }
}
