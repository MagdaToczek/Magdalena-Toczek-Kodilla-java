package com.kodilla.good.patterns.challenges;

public class ChallengesMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .forEach(System.out::println);

    }
}
