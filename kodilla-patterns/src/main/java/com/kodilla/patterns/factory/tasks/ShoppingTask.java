package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask extends AbstractTask {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
}
