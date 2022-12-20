package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
private CarService carService = new CarServiceImp();
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int i, ModelMap model) {
        List<Car> cars = carService.getCars(i);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
