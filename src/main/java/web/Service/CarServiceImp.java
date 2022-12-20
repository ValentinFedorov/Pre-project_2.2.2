package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private Car car = new Car();

    @Override
    public List<Car> getCars(int i) {
        List<Car> cars = car.getListCars();
        if (i >= 5) {
            return cars;
        } else if (i == 2) {
            List<Car> cars2 = new ArrayList<>();
            for (int k = 0; k < 2; k++) {
                cars2.add(cars.get(k));
            }
            return cars2;
        } else if (i == 3) {
            List<Car> cars3 = new ArrayList<>();
            for (int k = 0; k < 3; k++) {
                cars3.add(cars.get(k));
            }
            return cars3;
        } else if (i == 4) {
            List<Car> cars4 = new ArrayList<>();
            for (int k = 0; k < 4; k++) {
                cars4.add(cars.get(k));
            }
            return cars4;
        } else {
            return cars;
        }
    }
}
