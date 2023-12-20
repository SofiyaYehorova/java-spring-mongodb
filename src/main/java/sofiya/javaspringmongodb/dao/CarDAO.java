package sofiya.javaspringmongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import sofiya.javaspringmongodb.models.Car;

public interface CarDAO extends MongoRepository<Car, String> {

}
