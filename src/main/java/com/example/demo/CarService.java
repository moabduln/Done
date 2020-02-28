package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars=new ArrayList<>();
    public void saveCar(Car car){cars.add(car);}
    public List<Car>getAllCars(){return cars; }

    }



