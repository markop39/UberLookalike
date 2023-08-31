package com.example.TaxiDriverBackend.service.interfaces;

import com.example.TaxiDriverBackend.model.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DriverService {
    void add(Driver driver);
    List<Driver> getAll();
    Optional<Driver> getDriver(String id);
    void updateDriver(Driver driver);
    DriverDocument getDocument(String id);
    void addDocument(String id, String name, String documentImage);
    void deleteDocument(String id);
    Optional<Map<String, Object>> getDriverVehicle(String id);
    void addDriverVehicle(String id, Vehicle vehicle);
    void updateDriverVehicle(String id);
    Optional<Map<String, Object>> getDriverAllWorkingHours(String id);
    void addDriverAllWorkingHours(String id);
    List<Ride> getDriverRides(String id);
    Optional<WorkingHour> getDriverWorkingHour(String id);
    void updateDriverWorkingHour(String id);

}
