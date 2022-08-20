package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        ArrayList<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(new Country("Poland", new BigDecimal(("38430000"))));
        europeanCountries.add(new Country("Germany", new BigDecimal(("82790000"))));
        europeanCountries.add(new Country("Italy", new BigDecimal(("60500000"))));
        europeanCountries.add(new Country("France", new BigDecimal(("66990000"))));
        europeanCountries.add(new Country("Spain", new BigDecimal(("46720000"))));
        europeanCountries.add(new Country("United Kingdom", new BigDecimal(("66040000"))));
        europeanCountries.add(new Country("Netherlands", new BigDecimal(("17080000"))));
        europeanCountries.add(new Country("Belgium", new BigDecimal(("10510000"))));
        europeanCountries.add(new Country("Ukraine", new BigDecimal(("44830000"))));
        europeanCountries.add(new Country("Others European Countries", new BigDecimal(("307510000"))));
        //europeanCountries sum 741400000
        ArrayList<Country> africanCountries = new ArrayList<>();
        africanCountries.add(new Country("RPA", new BigDecimal(("56720000"))));
        africanCountries.add(new Country("Nigeria", new BigDecimal(("190900000"))));
        africanCountries.add(new Country("Zambia", new BigDecimal(("17090000"))));
        africanCountries.add(new Country("Kongo", new BigDecimal(("81340000"))));
        africanCountries.add(new Country("Ethiopia", new BigDecimal(("105000000"))));
        africanCountries.add(new Country("Angola", new BigDecimal(("29780000"))));
        africanCountries.add(new Country("Mozambique", new BigDecimal(("29670000"))));
        africanCountries.add(new Country("Others African Countries", new BigDecimal(("705500000"))));
        //africanCountries sum 1216000000
        ArrayList<Country> australianCountries = new ArrayList<>();
        australianCountries.add(new Country("South Australia", new BigDecimal(("2467900"))));
        australianCountries.add(new Country("Western Australia", new BigDecimal(("2576000"))));
        australianCountries.add(new Country("New South Wales", new BigDecimal(("7837700"))));
        australianCountries.add(new Country("Queensland", new BigDecimal(("4907600"))));
        australianCountries.add(new Country("Tasmania", new BigDecimal(("520100"))));
        australianCountries.add(new Country("Victoria", new BigDecimal(("6290700"))));
        //australianCountries sum 24600000
        ArrayList<Country> nAmericanCountries = new ArrayList<>();
        nAmericanCountries.add(new Country("USA", new BigDecimal(("327200000"))));
        nAmericanCountries.add(new Country("Canada", new BigDecimal(("37060000"))));
        nAmericanCountries.add(new Country("Cuba", new BigDecimal(("11480000"))));
        nAmericanCountries.add(new Country("Others in America", new BigDecimal(("203260000"))));
        //nAmericanCountries sum 579000000
        ArrayList<Country> sAmericanCountries = new ArrayList<>();
        sAmericanCountries.add(new Country("Argentina", new BigDecimal(("44270000"))));
        sAmericanCountries.add(new Country("Bolivia", new BigDecimal(("11050000"))));
        sAmericanCountries.add(new Country("Brazil", new BigDecimal(("219300000"))));
        sAmericanCountries.add(new Country("Chile", new BigDecimal(("17050000"))));
        sAmericanCountries.add(new Country("Columbia", new BigDecimal(("49070000"))));
        sAmericanCountries.add(new Country("Uruguay", new BigDecimal(("3460000"))));
        sAmericanCountries.add(new Country("Peru", new BigDecimal(("32170000"))));
        sAmericanCountries.add(new Country("Venezuela", new BigDecimal(("31980000"))));
        sAmericanCountries.add(new Country("Others", new BigDecimal(("23150000"))));
        //sAmericanCountries sum 422500000
        ArrayList<Country> asianCountries = new ArrayList<>();
        asianCountries.add(new Country("India", new BigDecimal(("1389000000"))));
        asianCountries.add(new Country("China", new BigDecimal(("1336000000"))));
        asianCountries.add(new Country("Russia", new BigDecimal(("1144500000"))));
        asianCountries.add(new Country("South Korea", new BigDecimal(("51470000"))));
        asianCountries.add(new Country("North Korea", new BigDecimal(("498730000"))));
        asianCountries.add(new Country("Japan", new BigDecimal(("126800000"))));
        //asianCountries sum 3299100000
        //sum world people quantity 7539000000

        List<Continent> continentsList = new ArrayList<>();
        continentsList.add(new Continent("Africa", africanCountries));
        continentsList.add(new Continent("Asia", asianCountries));
        continentsList.add(new Continent("Australia", australianCountries));
        continentsList.add(new Continent("Europe", europeanCountries));
        continentsList.add(new Continent("North America", nAmericanCountries));
        continentsList.add(new Continent("South America", sAmericanCountries));


        World world = new World(continentsList);

        //When
        BigDecimal worldPeopleQuantity =world.getPeopleQuantity();
        System.out.println(worldPeopleQuantity);
        BigDecimal expectedPeopleQuantity = new BigDecimal("7539000000");

        //Then
        Assertions.assertEquals(expectedPeopleQuantity, worldPeopleQuantity);


    }
}
