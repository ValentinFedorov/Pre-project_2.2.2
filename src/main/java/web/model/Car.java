package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    
    private String brand;
    private String horsepower;
    private String model;

    public Car() {
    }

    public Car(String brand, String horsepower, String model) {
        this.brand = brand;
        this.horsepower = horsepower;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String equipment) {
        this.model = equipment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsepower='" + horsepower + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
