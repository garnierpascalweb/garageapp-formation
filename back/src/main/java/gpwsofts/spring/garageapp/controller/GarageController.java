package gpwsofts.spring.garageapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gpwsofts.spring.garageapp.model.Car;
import gpwsofts.spring.garageapp.service.GarageService;

@CrossOrigin(origins = "*")
@RestController
public class GarageController {
	
	Logger logger = LoggerFactory.getLogger(GarageController.class);
	
	@Autowired
	private GarageService garageService;
		
	@RequestMapping(method = RequestMethod.GET, value = "/cars")
	public List<Car> getCars(){
		logger.info("appel GET getCars()");
		return garageService.getCars();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/car/{id}")
	public Car getCar(@PathVariable int id){
		logger.info("appel GET getCar(<{}>)", id);
		return garageService.getCar(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/car/{id}")
	public void deleteCar(@PathVariable int id){
		logger.info("appel DELETE deleteCar(<{}>)", id);
		garageService.deleteCar(id);
	}
		
	@RequestMapping(method = RequestMethod.POST, value="/cars")
	public void addCar(@RequestBody Car car){
		logger.info("appel POST addCar(<{}>)", car);
		garageService.addCar(car);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/cars/{id}")
	public void updateCar(@PathVariable int id, @RequestBody Car car){
		logger.info("appel PUT updateCar(<{}>)", car);
		garageService.updateCar(id, car);
	}

}
