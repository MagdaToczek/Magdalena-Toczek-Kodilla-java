package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ChallengesMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String moviesListing = movieStore.getMovies().entrySet().stream()
                .flatMap(movies -> movies.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(moviesListing);
    }
}
