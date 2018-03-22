package com.kodilla.patterns.factory.tasks;

public abstract class AbstractTask implements Task {
    private boolean isExecuted;

    public abstract String getTaskName();

    public void executeTask() {
        isExecuted = true;
    }

    public boolean isTaskExecuted() {
        return this.isExecuted;
    }
}
