package com.example.TaxiDriverBackend.service;

import com.example.TaxiDriverBackend.model.*;
import com.example.TaxiDriverBackend.service.interfaces.DriverService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DriverServiceImpl implements DriverService {

    @Override
    public void add(Driver driver) {

    }

    @Override
    public List<Driver> getAll() {
        return null;
    }

    @Override
    public Optional<Driver> getDriver(String id) {
        return Optional.empty();
    }


    @Override
    public void updateDriver(Driver driver) {

    }

    @Override
    public DriverDocument getDocument(String id) {
        return null;
    }

    @Override
    public void addDocument(String id, String name, String documentImage) {

    }

    @Override
    public void deleteDocument(String id) {

    }

    @Override
    public Optional<Map<String, Object>> getDriverVehicle(String id) {
        return null;
    }

    @Override
    public void addDriverVehicle(String id, Vehicle vehicle) {

    }

    @Override
    public void updateDriverVehicle(String id) {

    }

    @Override
    public Optional<Map<String, Object>> getDriverAllWorkingHours(String id) {
        return Optional.empty();
    }

    @Override
    public void addDriverAllWorkingHours(String id) {

    }

    @Override
    public List<Ride> getDriverRides(String id) {
        return null;
    }

    @Override
    public Optional<WorkingHour> getDriverWorkingHour(String id) {
        return Optional.empty();
    }

    @Override
    public void updateDriverWorkingHour(String id) {

    }
}
