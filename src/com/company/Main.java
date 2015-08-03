package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    void start(List<Car> cars) {
        for (Car car : cars) {
            car.start();
        }
    }

    void addLoopCollector() {
        ArrayList<Task> tasks = new ArrayList<>();

        Set<TaskResult> results = new HashSet<>();
        for (Task t : tasks) {
            t.execute();
            results.add(t.getResult());
        }
    }
}
