package sofiya.javaspringmongodb.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Car {
    @Id
    private String id;
    private String model;
    private String producer;
    private int power;

}
