package com.example.TaxiDriverBackend.service.interfaces;

import com.example.TaxiDriverBackend.model.Driver;
import com.example.TaxiDriverBackend.model.GeoCoordinate;
import com.example.TaxiDriverBackend.model.User;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    void setLocation(String id, GeoCoordinate geoCoordinate);
}
