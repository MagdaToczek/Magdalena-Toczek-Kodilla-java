package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ChallengesMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
<<<<<<< HEAD
        String moviesListing = movieStore.getMovies().values().stream()
                .flatMap(movies -> movies.stream())
=======
        String moviesListing = movieStore.getMovies().entrySet().stream()
                .flatMap(movies -> movies.getValue().stream())
>>>>>>> 8331a66cb4e5f67d26296e07c623bbba78e2f127
                .collect(Collectors.joining("!"));

        System.out.println(moviesListing);
    }
}
