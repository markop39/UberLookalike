package com.example.TaxiDriverBackend.model;

public class DriverDocument {
    public String name;
    public String documentImage;
    public int driverId;

    public DriverDocument(String name, String documentImage, int driverId) {
        this.name = name;
        this.documentImage = documentImage;
        this.driverId = driverId;
    }
}
