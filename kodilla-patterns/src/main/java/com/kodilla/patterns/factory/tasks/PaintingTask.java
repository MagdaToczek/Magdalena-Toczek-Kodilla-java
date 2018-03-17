package com.kodilla.patterns.factory.tasks;

import java.time.LocalTime;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
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
