package tp3exosYaip5;

public class Circle 
{
   private double radius;
   private String color;
   
   public Circle() 
   {
      radius = 1.0;
      color = "red";
   }

   public Circle(double radius) 
   {
	   this.radius = radius;                      
	   color = "red";
   }
   
   public Circle (double r, String c) 
   {
	   radius = r;
	   color = c;
   }
   
   public String toString() 
   {
	   return "Circle [radius = " + radius + ", color = " + color + "]";
   }
   
   public double getCircumference() 
   {
       return 2 * Math.PI * radius;
   }
   
   public void setRadius(double radius) 
   {
	   this.radius = radius;   
   }
   
   public double getRadius() 
   {
     return radius; 
   }
   
   public double getArea() 
   {
      return radius*radius*Math.PI;
   }
   
   public String getColor() 
   {
	   return color;
   }
}
