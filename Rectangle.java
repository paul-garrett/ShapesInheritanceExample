public class Rectangle extends Shape {
  private double height;
  private double width;

  public Rectangle (){
    
  }
  
  public Rectangle ( String color, boolean filled, double height, double width){
    super(color, filled);
    this.height = height;
    this.width = width;
  }

  

  public double getHeight (){
    return height;
  }
  public double getWidth (){
    return width;
  }
  public double getArea (){
    return width * height;
     
  }
}

/* 	A Rectangle has these properties:
		height
  		width
	
	and these methods:
 		getHeight
   		getWidth
	 	getArea
*/
