package com.example.TaxiDriverBackend.model;
import java.time.LocalDateTime;

public class Note {
    private Integer id;
    private LocalDateTime date;
    private String message;

    public Note(Integer id, LocalDateTime date, String message) {
        this.id = id;
        this.date = date;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
