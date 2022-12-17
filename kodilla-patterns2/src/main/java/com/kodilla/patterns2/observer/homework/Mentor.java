package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentExercises studentExercises) {
        System.out.println("Mentor "+username + ": New exercise finished by " + studentExercises.getStudentName()+ "\n" +
                " (total: " + studentExercises.getExercises().size() + " exercises)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
