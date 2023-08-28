package gpwsofts.spring.garageapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import gpwsofts.spring.garageapp.model.Car;

@Service
public class GarageService {
	
	static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
			new Car(1, "Laguna", "Renault", 2004, Car.Color.RED),
			new Car(2, "307 Style", "Peugeot", 2002, Car.Color.BLUE),
			new Car(3, "308 SW", "Peugeot", 2010, Car.Color.BLUE)
	));

	public List<Car> getCars(){
		return cars;
	}
	
	public Car getCar(int id){
		return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
	}
}
