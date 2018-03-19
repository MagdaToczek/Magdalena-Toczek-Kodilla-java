package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String chosenTask) {
        switch (chosenTask) {
            case SHOPPING:
                return new ShoppingTask("Shopping lingerie", "pijamas", 3);
            case PAINTING:
                return new PaintingTask("Painting", "navy blue", "wall");
            case DRIVING:
                return new DrivingTask("Driving", "Florence", "Maserati");
            default:
                throw new IllegalArgumentException();
        }
    }
}
