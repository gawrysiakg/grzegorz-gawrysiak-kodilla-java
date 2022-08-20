package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(String name, BigDecimal amountOfPpl) {
        this.peopleQuantity = amountOfPpl;
        this.countryName = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }}
