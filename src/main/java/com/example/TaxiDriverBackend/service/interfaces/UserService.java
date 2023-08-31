package com.example.TaxiDriverBackend.service.interfaces;

import com.example.TaxiDriverBackend.model.Driver;
import com.example.TaxiDriverBackend.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
}
