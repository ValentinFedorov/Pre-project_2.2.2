package web.car_service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(List<Car> cars, int i) {
        cars = cars.stream().limit(i).collect(Collectors.toList());
        return cars;
    }
}
