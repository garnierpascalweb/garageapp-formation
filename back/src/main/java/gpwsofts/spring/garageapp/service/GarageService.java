package gpwsofts.spring.garageapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gpwsofts.spring.garageapp.model.Car;
import gpwsofts.spring.garageapp.repository.GarageRepository;

@Service
public class GarageService {
	
	@Autowired
	private GarageRepository garageRepository;
	
	static private ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
			new Car(1, "Laguna", "Renault", 2004, Car.Color.RED),
			new Car(2, "307 Style", "Peugeot", 2002, Car.Color.BLUE),
			new Car(3, "308 SW", "Peugeot", 2010, Car.Color.BLUE)
	));

	public List<Car> getCars(){
		garageRepository.findAll().forEach(car -> cars.add(car));
		return cars;
	}
	
	public Car getCar(int id){
		//return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
		return garageRepository.findById(id).orElse(null);
	}
	
	public void addCar(Car car){
		// cars.add(car);
		garageRepository.save(car);
	}
	
	public void updateCar(int id, Car car){
		/*
		cars.forEach(ccar -> {
			if (ccar.getId() == id){
				cars.set(id, car);
			}
		});
		*/
		garageRepository.save(car);
	}
	
	public void deleteCar(int id){
		// cars.removeIf(car -> car.getId() == id);
		garageRepository.deleteById(id);
	}
}
