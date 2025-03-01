package tp3exosYaip6;

public class MovablePoint implements Movable 
{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xS, int yS)
	{
		this.x = x;
		this.y = y;
		this.xSpeed = xS;
		this.ySpeed = yS;
	}
	
	@Override
	public void moveUp()
	{
		y -= ySpeed;
	}
	
	@Override
	public void moveDown()
	{
		y += ySpeed;
	}
	
	@Override
	public void moveLeft()
	{
		x -= xSpeed;
	}
	
	@Override
	public void moveRight()
	{
		x += xSpeed;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + "), speed = (" + xSpeed + ", " + ySpeed + ")";	
	}
	
	// Main de MovablePoint
    public static void main(String[] args) 
    {
    	MovablePoint M1 = new MovablePoint(4, 7, 76, 9);
        System.out.println(M1 + "\n");
        
        M1.moveUp();
        System.out.println(M1 + "\n");
        M1.moveDown();
        System.out.println(M1 + "\n");
        M1.moveLeft();
        System.out.println(M1 + "\n");
        M1.moveRight();
        System.out.println(M1 + "\n");
    }
}
