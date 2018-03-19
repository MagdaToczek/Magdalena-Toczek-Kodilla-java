package com.kodilla.patterns.factory.tasks;

import java.time.LocalTime;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "I'm painting " + whatToPaint + " in " + color;
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
