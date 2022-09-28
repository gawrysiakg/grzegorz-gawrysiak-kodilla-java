package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {
    public static void main(String[] args) {


        MovieStore movieStore=new MovieStore();
        Map<String, List<String>> booksTitlesWithTranslations=movieStore.getMovies();

        String allMovies=booksTitlesWithTranslations.entrySet().stream()
               .map(g-> g.getValue())
               .flatMap(list->list.stream())
               .reduce((r, r2)->r+"!"+r2 )
               .get();


        System.out.println(allMovies);


        }


    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }
}
