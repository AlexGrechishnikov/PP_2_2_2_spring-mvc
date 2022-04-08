package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCarList() {
        return List.of(
                new Car("AUDI", "A-1", 2001),
                new Car("AUDI", "A-3", 2003),
                new Car("AUDI", "A-4", 2004),
                new Car("AUDI", "A-6", 2006),
                new Car("AUDI", "A-8", 2008)
        );
    }
}
