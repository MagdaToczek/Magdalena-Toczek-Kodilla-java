package com.kodilla.patterns.factory.tasks;

import java.time.LocalTime;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
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
