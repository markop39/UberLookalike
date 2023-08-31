package com.example.TaxiDriverBackend.model;

import java.util.List;

public class ReviewEndpoint {

    private int totalCount;
    public List<Review> reviews;

    public ReviewEndpoint(List<Review> results) {
        this.reviews = results;
        this.totalCount = results.size();
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void addReview(Review pd){
        reviews.add(pd);
        totalCount += 1;
    }



}
