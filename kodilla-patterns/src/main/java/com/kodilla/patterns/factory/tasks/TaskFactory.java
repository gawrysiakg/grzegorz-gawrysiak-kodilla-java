package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";


    public final Task makeTask(final String taskClass){
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("Take the kids", "to school", "car");
            case PAINTING_TASK -> new PaintingTask("Paint", "green", "bedroom");
            case SHOPPING_TASK -> new ShoppingTask("Go to supermarket", "beer", 20);
            default -> null;
        };
    }
}
