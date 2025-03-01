package tp3exosYaip6;

class Cat extends Animal
{
	public Cat(String name)
	{
		super(name);
	}
	
	@Override
	public void greets()
	{
		System.out.println("Meow");
	}
		
	// Main de Mammal
    public static void main(String[] args) 
    {
        Cat c1 = new Cat("Cassiopé");
        c1.greets();
   
        Cat c2 = new Cat("Lyra");
        c2.greets();
        
        Cat c3 = new Cat("Stitch");
        c3.greets();
    }
}
