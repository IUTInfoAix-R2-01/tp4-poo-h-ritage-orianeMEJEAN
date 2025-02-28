package tp3exosYaip4;

class Mammal extends Animal
{
	public Mammal(String name)
	{
		super(name);
	}
	
	@Override
	public String toString()
	{
		return "Mammal = [" + super.toString()+ "]";
	}
	
	// Main de Mammal
    public static void main(String[] args) 
    {
        Mammal m1 = new Mammal("Cassiopé");
        System.out.println(m1);
        
   
        Mammal m2 = new Mammal("Lyra");
        System.out.println(m2);
        
        Mammal m3 = new Mammal("Stitch");
        System.out.println(m3);
    }
}
