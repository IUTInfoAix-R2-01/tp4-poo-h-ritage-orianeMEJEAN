package tp3exosYaip4;

public class Animal 
{
	private String name;
	
	public Animal(String n)
	{
		this.name = n;
	}
	
	public String toString()
	{
		return "Animal = [" + name + "]";
	}
	
	// Main de Animal
    public static void main(String[] args) 
    {
        Animal a1 = new Animal("Cassiopé");
        System.out.println(a1);
        
        Animal a2 = new Animal("Lyra");
        System.out.println(a2);
        
        Animal a3 = new Animal("Stitch");
        System.out.println(a3);
    }
}
