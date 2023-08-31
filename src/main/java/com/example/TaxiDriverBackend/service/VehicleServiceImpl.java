package com.example.TaxiDriverBackend.service;

import com.example.TaxiDriverBackend.model.Driver;
import com.example.TaxiDriverBackend.model.GeoCoordinate;
import com.example.TaxiDriverBackend.model.Vehicle;
import com.example.TaxiDriverBackend.service.interfaces.DriverService;
import com.example.TaxiDriverBackend.service.interfaces.VehicleService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {


    private List<Vehicle> vehicleList = Arrays.asList(
            new Vehicle("1", new Driver(1, "Pera", "Peric", "2175812", "+31278951", "pera@gmail.com", "Nardognog fafsnioaf 15", "sifra123"), "Merceds",
                    "LUXURY", "NS-123RH", 5, new GeoCoordinate("Gagrioova 10", 50, 50), false, false));


    @Override
    public void setLocation(String id, GeoCoordinate geoCoordinate) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                vehicle.setCurrentLocation(geoCoordinate);
            }
        }
    }
}




