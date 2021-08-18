package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> allKids = new ArrayList<>();
        learners.forEach(allKids::add);
        double numberOfHoursPerLearner = numberOfHours / allKids.size();
        for (Learner learner : allKids) {
            teach(learner, numberOfHours);

        }
    }
    }
}
