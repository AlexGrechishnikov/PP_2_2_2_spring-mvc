package web.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Car {
    private final String brand;
    private final String model;
    private final int yearOfManufacture;

    public Car(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return String.format("Car{brand='%s',model='%s',yearOfManufacture='%d'}",
                brand, model, yearOfManufacture);
    }
}
