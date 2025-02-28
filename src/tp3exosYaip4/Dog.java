package tp3exosYaip4;

class Dog extends Mammal
{
	public Dog(String name)
	{
		super(name);
	}
	
	public void greets()
	{
		System.out.println("Woof");
	}
	
	public void greets(Dog another)
	{
		System.out.println("Woooof");
	}
	
	@Override
	public String toString()
	{
		return "Dog = [" + super.toString()+ "]";
	}
	
	// Main de Mammal
    public static void main(String[] args) 
    {
        Dog d1 = new Dog("Shadow");
        System.out.println(d1);
        d1.greets();
   
        Dog d2 = new Dog("Eclipse");
        System.out.println(d2);
        d1.greets(d2);
    }
}
