package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.car_service.CarService;
import web.car_service.CarServiceImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

private CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int i, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "600", "M8"));
        cars.add(new Car("Mersedes-Benz", "300", "GLC"));
        cars.add(new Car("Renault", "110", "Logan"));
        cars.add(new Car("Nissan", "250", "Almera"));
        cars.add(new Car("Honda", "158", "CR-V"));
        cars = carService.getCars(cars, i);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
