package com.dio.springbootdi;

public class Car implements Vehicle {

    @Override
    public void action() {
        System.out.println("Is a car.");
    }

}
