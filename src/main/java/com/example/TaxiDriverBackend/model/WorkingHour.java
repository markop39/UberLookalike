package com.example.TaxiDriverBackend.model;

import java.time.LocalDateTime;

public class WorkingHour {
    public int id;
    public LocalDateTime start;
    public LocalDateTime end;

    public WorkingHour(int id, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }
}
