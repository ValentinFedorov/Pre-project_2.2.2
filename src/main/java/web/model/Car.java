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

    public List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "600", "M8"));
        cars.add(new Car("Mersedes-Benz", "300", "GLC"));
        cars.add(new Car("Renault", "110", "Logan"));
        cars.add(new Car("Nissan", "250", "Almera"));
        cars.add(new Car("Honda", "158", "CR-V"));
        return cars;
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
