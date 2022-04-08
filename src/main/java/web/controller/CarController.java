package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(name = "count", required = false) Integer count, ModelMap model) {
        count = count != null ?
                ((count <= 0 || count > 5) ? 5 : count) :
                5 ;

        List<Car> cars = carService.getCarList().stream()
                .limit(count)
                .collect(Collectors.toList());
        model.addAttribute("cars", cars);
        return "cars";
    }
}
