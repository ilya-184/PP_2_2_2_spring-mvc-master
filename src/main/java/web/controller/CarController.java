package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCar(@RequestParam(name = "count", required = false, defaultValue = "0") int count, Model model) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "215", "Ilia"));
        carList.add(new Car("MB", "125", "Oleg"));
        carList.add(new Car("Lada", "666", "Igor"));
        carList.add(new Car("Rolls-Roys", "258", "Anna"));
        carList.add(new Car("Mitsubishi", "789", "Nikita"));

        CarServiceImpl carService = new CarServiceImpl();

        model.addAttribute("carList", carService.prepareCarList(carList, count));
        return "cars";
    }
}
