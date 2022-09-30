package com.kodilla.good.patterns.challenges.example;

import java.time.LocalDateTime;

public interface RentalRepository {
    void createCarRental(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo);
}
