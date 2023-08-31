package com.example.TaxiDriverBackend.service;

import com.example.TaxiDriverBackend.model.Driver;
import com.example.TaxiDriverBackend.model.User;
import com.example.TaxiDriverBackend.service.interfaces.DriverService;
import com.example.TaxiDriverBackend.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private List<User> userList = Arrays.asList(
            new User(1,"Dusan", "Pera", "prva-slika.img", "2175812", "pera@gmail.com", "Nardognog fafsnioaf 15"),
            new User(1, "Pavle", "Djura", "druga-slika.img", "2134125", "djura@gmail.com", "AKISDNASIGFNIOAGS 15")
    );


    @Override
    public List<User> getUsers() {
        return userList;
    }
}
