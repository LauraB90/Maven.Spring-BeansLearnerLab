package com.example.demo.models;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(long id, String name){

        super(id, name);
    }


    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime+= numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
