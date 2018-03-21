package com.kodilla.patterns.factory.tasks;

public abstract class AbstractTask {
    private String taskName;
    TaskFactory factory = new TaskFactory();

    public Task createTask(String taskName) {
        return factory.createTask(taskName);
    }
}
