package tp3exosYaip4;

class Cat extends Mammal
{
	public Cat(String name)
	{
		super(name);
	}
	
	public void greets()
	{
		System.out.println("Meow");
	}
	
	@Override
	public String toString()
	{
		return "Cat = [" + super.toString()+ "]";
	}
	
	// Main de Mammal
    public static void main(String[] args) 
    {
        Cat c1 = new Cat("Cassiopé");
        System.out.println(c1);
        c1.greets();
   
        Cat c2 = new Cat("Lyra");
        System.out.println(c2);
        c2.greets();
        
        Cat c3 = new Cat("Stitch");
        System.out.println(c3);
        c3.greets();
    }
}
