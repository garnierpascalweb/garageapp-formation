package gpwsofts.spring.garageapp.repository;

import org.springframework.data.repository.CrudRepository;

import gpwsofts.spring.garageapp.model.Car;

public interface GarageRepository extends CrudRepository<Car, Integer> {

}
