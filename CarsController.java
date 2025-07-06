package com.example.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

    private Cars cars;// Dependency injection

    @Autowired
    public CarsController(Cars cars) {
        this.cars = cars;
    }

    @GetMapping("/")
    public String showMsg(){
        return cars.getModels();
    }
}
