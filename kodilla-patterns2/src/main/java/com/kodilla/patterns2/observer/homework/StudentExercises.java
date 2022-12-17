package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentExercises implements Observable {
   // private final List<String> exercises;
    private final Deque<String> exercises;
    private final List<Observer> observers;
    private final String studentName;

    public StudentExercises(String studentName) {
        exercises = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addExercise(String exercise) {
        exercises.offer(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getExercises() {
        return exercises;
    }

    public String getStudentName() {
        return studentName;
    }
}

