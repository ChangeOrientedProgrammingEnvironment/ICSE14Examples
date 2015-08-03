package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Convert Element to Collection
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
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        long totalTime = end - start;
    }

    private boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    void addNullCheckForParameter() {
        class Inner {
            Registry registry;

            void addPerson(Person p) {
                if (p == null) return;
                registry.add(p);
            }

            Record retrieveRecordsFor(Person p) {
                if (p == null) return null;
                Record record;
                record = registry.retrieveRecords(p);
                return record;
            }
        }
    }

}
