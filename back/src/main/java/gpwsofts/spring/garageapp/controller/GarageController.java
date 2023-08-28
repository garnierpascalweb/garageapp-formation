package gpwsofts.spring.garageapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gpwsofts.spring.garageapp.model.Car;
import gpwsofts.spring.garageapp.model.Car.Color;

@RestController
public class GarageController {

	@RequestMapping("/car")
	public Car getCar(){
		Car car = new Car();
		car.setBrand("Laguna");
		car.setModel("Renaut");
		car.setYear(2004);
		car.setColor(Color.RED);
		return car;
	}
}
