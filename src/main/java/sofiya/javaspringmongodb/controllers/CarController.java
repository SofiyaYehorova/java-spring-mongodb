package sofiya.javaspringmongodb.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sofiya.javaspringmongodb.models.Car;
import sofiya.javaspringmongodb.services.CarService;

import java.util.List;

@RequestMapping("/cars")
//@AllArgsConstructor
@RestController
public class CarController {

    private final CarService carService;

    public CarController(@Qualifier("carServiceImplem2") CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public ResponseEntity<List<Car>> getCars() {
        return new ResponseEntity<>(carService.getCar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable String id) {
        return new ResponseEntity<>(carService.getCar(id), HttpStatus.OK);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void saveCar(@RequestBody Car car) {
        carService.saveCar(car);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable String id){
        carService.deleteCar(id
        );
    }
}
