package com.google;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private String gear;
    private String gearType;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                ", gearType='" + gearType + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(engine, car.engine) && Objects.equals(gear, car.gear) && Objects.equals(gearType, car.gearType) && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, color, engine, gear, gearType, engineType);
    }

    private String engineType;

}
