package com.company;

import java.util.ArrayList;
import java.util.List;

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

        for (Task t : tasks) {
            t.execute();
        }
    }
}
