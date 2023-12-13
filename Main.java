import java.util.*;

class Main {
  public static void main(String[] args) {
	  Circle c1 = new Circle("Blue", false, 32.77);
	  Rectangle r1 = new Rectangle ("Red",true,8.0, 6.5);
	  System.out.println("Area: " + c1.getArea());
	  System.out.println("Area: " + r1.getArea());
	  System.out.println("Color: " + r1.getColor());
	  

	  Shape s1 = new Circle("Green", false, 24.55);
	  Shape s2 = new Rectangle ("Orange", true, 12.4, 7.7);
	  // System.out.println("Area: " + s1.getArea());
	  // System.out.println("Color: " + s2.getColor());

	  ArrayList<Shape> array = new ArrayList();
	  array.add(s1);
	  array.add(s2);
	  array.add(c1);
	  array.add(r1);
	  System.out.println(array);


	  // Example of using a setter method to set a new radius for the instance of the circle.
	  c1.setRadius(25);
	  System.out.println(c1.getRadius());
    }
}
