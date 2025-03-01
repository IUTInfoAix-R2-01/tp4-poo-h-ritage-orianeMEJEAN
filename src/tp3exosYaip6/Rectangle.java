package tp3exosYaip6;

public class Rectangle implements GeometricObject
{
	private double width;
	private double length;
	
	public Rectangle (double w, double l)
	{
		this.width = w;
		this.length = l;
	}
	
	@Override
	public double getArea() 
	{
	    return width * length;
	}
	   
	@Override
	public double getPerimeter()
	{
		return 2 * (width + length);
	}
	   
	public String toString() 
	{
	   return "Rectangle [width = " + width + "length = " + length + "]";
	}
	
	// Main de Rectangle
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(4, 7);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
