package sofiya.javaspringmongodb.services;

import sofiya.javaspringmongodb.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCar();
    Car getCar(String id);
    void saveCar(Car car);
    void deleteCar(String id);
}
