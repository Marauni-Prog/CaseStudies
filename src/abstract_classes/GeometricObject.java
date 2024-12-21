package abstract_classes;

import java.util.Date;

public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	protected GeometricObject() {
		this("RED", true);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject \ncolor=" + color + "\nfilled=" +
	filled + "\ndateCreated=" + dateCreated;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
	
}
