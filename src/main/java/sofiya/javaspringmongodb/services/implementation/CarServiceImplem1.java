package sofiya.javaspringmongodb.services.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sofiya.javaspringmongodb.dao.CarDAO;
import sofiya.javaspringmongodb.models.Car;
import sofiya.javaspringmongodb.services.CarService;

import java.util.List;
@AllArgsConstructor
@Service
public class CarServiceImplem1 implements CarService {
    private CarDAO carDAO;
    @Override
    public List<Car> getCar() {
        return carDAO.findAll();
    }

    @Override
    public Car getCar(String id) {
        return carDAO.findById(id).get();
    }

    @Override
    public void saveCar(Car car) {
        carDAO.save(car);
    }

    @Override
    public void deleteCar(String id) {
        carDAO.delete(carDAO.findById(id).get());
    }
}
