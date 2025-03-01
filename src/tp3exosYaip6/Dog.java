package tp3exosYaip6;

class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
	}
	
	@Override
	public void greets()
	{
		System.out.println("Woof");
	}
		
	public void greets(Dog another)
	{
		System.out.println("Woooof");
	}
		
	// Main de Mammal
    public static void main(String[] args) 
    {
        Dog d1 = new Dog("Shadow");
        d1.greets();
   
        Dog d2 = new Dog("Eclipse");
        d1.greets(d2);
    }
}
