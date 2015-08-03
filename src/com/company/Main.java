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

    void wrapCodeWithTimer() {
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
