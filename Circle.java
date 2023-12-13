import java.lang.Math;

class Circle extends Shape {
	private double radius;

	// default constructor
	// if we use this one in the main class, then it will set the radius to 0.0
	public Circle() {}

	// overloaded constructor
	// set the radius at the time of object instantiation
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	// use PI to get the cicumference 2 * pi * radius
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// use PI to get the area pi * r^2
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
