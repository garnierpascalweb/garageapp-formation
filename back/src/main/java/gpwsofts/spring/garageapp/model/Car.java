package gpwsofts.spring.garageapp.model;

/**
 * 
 * @author Pascal
 *
 */
public class Car {
	private String model;
	private String brand;
	private int year;
	private Color color;
	
	
	
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
