package tp3exosYaip6;

public class TestResizableCircle
{
    public static void main(String[] args) 
    {
    	ResizableCircle r1 = new ResizableCircle(9);

        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter() + "\n");
        
        r1.resize(150);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}