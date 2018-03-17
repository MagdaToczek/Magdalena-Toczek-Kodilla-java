package com.kodilla.patterns.factory.tasks;

import java.time.LocalTime;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "I'm driving to " + where + " by my " + using;
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
