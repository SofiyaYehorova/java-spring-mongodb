package sofiya.javaspringmongodb.services.implementation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sofiya.javaspringmongodb.dao.CarDAO;
import sofiya.javaspringmongodb.models.Car;
import sofiya.javaspringmongodb.services.CarService;

import java.util.List;

@AllArgsConstructor
@Service
public class CarServiceImplem2 implements CarService {
    private CarDAO carDAO;

    @Override
    public List<Car> getCar() {
        return carDAO.findAll();
    }

    @Override
    public Car getCar(String id) {
        if (id.isEmpty() || id == null) {
            throw new RuntimeException("id is bad");
        }
        return carDAO.findById(id).orElseGet(Car::new);
    }

    @Override
    public void saveCar(Car car) {
        if (car == null){
            throw new RuntimeException("car cannot be null");
        }
        carDAO.save(car);
    }

    @Override
    public void deleteCar(String id) {
        carDAO.deleteById(id);
    }
}
