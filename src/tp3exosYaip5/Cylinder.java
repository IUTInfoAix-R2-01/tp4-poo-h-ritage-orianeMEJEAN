package tp3exosYaip5;

public class Cylinder 
{
   private Circle base;
   private double height;

   public Cylinder() 
   {
      this.base = new Circle();
      this.height = 1.0;
   }

   public Cylinder(double radius, String color, double height) 
   {
      this.base = new Circle(radius, color); // Création interne du Circle
      this.height = height;
   }

   public double getHeight() 
   {
      return height;
   }

   public double getVolume() 
   {
      return base.getArea() * height;
   }

   public double getRadius() // Otenir le rayon du cylindre directement à partir de Circle
   {
      return base.getRadius();
   }

   
   public String getColor() // Obtenir la couleur du cylindre directement à partir de Circle
   {
      return base.getColor();
   }

   // Main de Cylindre
   public static void main(String[] args) 
   {
      Cylinder cylinder = new Cylinder(3.0, "blue", 5.0);
      System.out.println("Volume du cylindre : " + cylinder.getVolume());
      System.out.println("Rayon du cylindre : " + cylinder.getRadius());
      System.out.println("Couleur du cylindre : " + cylinder.getColor());
   }
}
