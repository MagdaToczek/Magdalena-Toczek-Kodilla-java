package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue kodillaTask) {
        System.out.println(mentorName + ": New task in queue of " + kodillaTask.getStudentName() + "\n (total: " + kodillaTask.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
