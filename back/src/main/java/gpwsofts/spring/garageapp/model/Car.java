package gpwsofts.spring.garageapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Pascal
 *
 */
// Entity (objet Database)
@Entity
public class Car {
	@Id
	@GeneratedValue
	private int id;
	private String model;
	private String brand;
	@Column (name = "relesed_year")
	private int year;
	private Color color;
	
	public Car(int id, String model, String brand, int year, Color color){
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.color = color;
	}
	
	public Car(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public enum Color {
		RED,BLUE,GREEN,YELLOW
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
