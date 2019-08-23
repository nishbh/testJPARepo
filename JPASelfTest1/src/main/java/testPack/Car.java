package testPack;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcar;
	private String manufacturer;
	private String color;
	private String model;
	public int getIdcar() {
		return idcar;
	}
	public void setIdcar(int idcar) {
		this.idcar = idcar;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [idcar=" + idcar + ", manufacturer=" + manufacturer + ", color=" + color + ", model=" + model + "]";
	}
	public Car(int idcar, String manufacturer, String color, String model) {
		//super();
		this.idcar = idcar;
		this.manufacturer = manufacturer;
		this.color = color;
		this.model = model;
	}
	public Car() {
		//super();
	}
	
	
	

}
