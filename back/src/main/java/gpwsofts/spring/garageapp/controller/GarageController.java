package gpwsofts.spring.garageapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gpwsofts.spring.garageapp.model.Car;
import gpwsofts.spring.garageapp.service.GarageService;

@RestController
public class GarageController {
	
	@Autowired
	private GarageService garageService;
		
	@RequestMapping(method = RequestMethod.GET, value = "/cars")
	public List<Car> getCars(){
		return garageService.getCars();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/car/{id}")
	public Car getCar(@PathVariable int id){
		return garageService.getCar(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/car/{id}")
	public void deleteCar(@PathVariable int id){
		garageService.deleteCar(id);
	}
		
	@RequestMapping(method = RequestMethod.POST, value="/cars")
	public void addCar(@RequestBody Car car){
		garageService.addCar(car);
	}
}
