/*
	The Shape class defines properties and behaviors for all shapes.
 
Properties:
	color (String)
 	filled (boolean)
  
*/
class Shape {
	private String color;
	private boolean filled;

	public Shape() {};

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public boolean getFilled() {
		return filled;
	}
}
