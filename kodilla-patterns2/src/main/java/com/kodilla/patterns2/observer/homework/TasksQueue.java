package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {
    private List<String> tasks;
    private final List<Observer> mentors;
    private final String studentName;

    public TasksQueue(String studentName) {
        tasks = new ArrayList<>();
        mentors = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
