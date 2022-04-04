package Aula05;

public class Circle {
	private double radius;

	Circle(double radius) {
		this.setCircle(radius);
	}

	public double perimetro() {
		return 2 * Math.PI * this.radius;
	}

	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	public String toString() {
		return "Circle with radius: " + this.radius;
	}

	public boolean equals(Circle b) {
		return this.radius == b.getRadius();
	}

	public double getRadius() {
		return this.radius;
	}

	public void setCircle(double radius) {
		assert radius > 0;
		this.radius = radius;
	}
}
