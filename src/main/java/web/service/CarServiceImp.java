package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("Toyota", 7, "Silver"));
        cars.add(new Car("BMW", 8, "Gold"));
        cars.add(new Car("Mercedes", 9, "White"));
        cars.add(new Car("Honda", 5, "Red"));
        cars.add(new Car("Ford", 4, "Blue"));
    }
    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) return cars;
        if (count <= 0) return Collections.emptyList();
        if (count >= cars.size()) return cars;
        return cars.subList(0, count);
    }
}