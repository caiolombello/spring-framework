package com.dio.springbootdi;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    public static void main(String[] args) {
        Driver driver = new Driver(new Car());
        driver.automobile();
    }

    private final Vehicle vehicle;

    public Driver(Vehicle obj) {
        this.vehicle = obj;
    }

    public void automobile() {
        vehicle.action();
    }

}
