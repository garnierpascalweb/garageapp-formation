package gpwsofts.spring.garageapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gpwsofts.spring.garageapp.model.Car;
import gpwsofts.spring.garageapp.service.GarageService;

@RestController
public class GarageController {
	
	@Autowired
	private GarageService garageService;
		
	@RequestMapping("/cars")
	public List<Car> getCars(){
		return garageService.getCars();
	}
	
	@RequestMapping("/car/{id}")
	public Car getCar(@PathVariable int id){
		return garageService.getCar(id);
	}
}
