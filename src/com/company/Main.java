package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // 1. Convert Element to Collection
    void start(List<Car> cars) {
        for (Car car : cars) {
            car.start();
        }
    }

    // 2.
    void addLoopCollector() {
        ArrayList<Task> tasks = new ArrayList<>();

        Set<TaskResult> results = new HashSet<>();
        for (Task t : tasks) {
            t.execute();
            results.add(t.getResult());
        }
    }

    // 3.
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

    // 4.
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

    // 5. Add a New Enum Element
    // Cannot create an enum inside of a method

    // 6.
    void changeAndPropagateFieldType() {
        class Inner {
            long mileage;

            long getCurrentMileage() {
                return mileage;
            }

            void updateMileage(long newMiles) {
                mileage += newMiles;
            }
        }
    }

    // 7.
    void changeFieldToThreadLocal() {
        class Inner {
            ThreadLocal<Cache> c = new ThreadLocal<Cache>() {
                protected Cache initialValue() {
                    return new Cache();
                }
            };

            void putInfo(String key, String value) {
                c.get().add(key, value);
            }
        }
    }

    // 8.
    void copyFieldInitializer() {
        class Cars {
            List<Car> compacts = new ArrayList<>();
            List<Car> sedans = new ArrayList<>();
        }
    }

    // 9.
    void createAndInitializeNewField() {
        class Automobile {
            private List<Valve> valves;
            private List<Wheel> wheels;

            public Automobile() {
                valves = new ArrayList<Valve>();
                wheels = new ArrayList<Wheel>();
            }
        }
    }

    // 10.
    void moveInterfaceImplementationToInnerClass() {
        class FolderNode {
            class SelectionBehaviour implements SelectionListener {
                public void selected() {

                }
            }
        }
    }
}
