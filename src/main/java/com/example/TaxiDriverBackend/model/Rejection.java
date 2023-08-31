package com.example.TaxiDriverBackend.model;

import java.time.LocalDateTime;

public class Rejection {
    public String reason;
    public LocalDateTime timeOfRejection;

    public Rejection(String reason, LocalDateTime timeOfRejection) {
        this.reason = reason;
        this.timeOfRejection = timeOfRejection;
    }
}
