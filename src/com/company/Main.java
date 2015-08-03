package com.company;

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
}
