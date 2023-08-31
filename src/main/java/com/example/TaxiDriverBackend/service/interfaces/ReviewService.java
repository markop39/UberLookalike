package com.example.TaxiDriverBackend.service.interfaces;

import com.example.TaxiDriverBackend.model.ReviewEndpoint;

import java.util.Optional;

public interface ReviewService {

    Optional<ReviewEndpoint> getAllReview();
}
