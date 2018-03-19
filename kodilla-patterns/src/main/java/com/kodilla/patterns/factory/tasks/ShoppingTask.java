package com.kodilla.patterns.factory.tasks;

import java.time.LocalTime;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "I'm buying " + quantity + " " + whatToBuy;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (LocalTime.now().getHour() % 2 == 0) {
            return true;
        }
        return false;
    }
}
