package tp3exosYaip6;

public abstract class Animal 
{
	private String name;
	
	public Animal(String n)
	{
		this.name = n;
	}
	
	public abstract void greets();
	
	public String toString()
	{
		return "Animal = [" + name + "]";
	}
}
