package tp3exosYaip6;

class BigDog extends Dog
{
	public BigDog(String name)
	{
		super(name);
	}
	
	@Override
	public void greets()
	{
		System.out.println("Wooow");
	}
	
	@Override
	public void greets(Dog another)
	{
		System.out.println("Wooooow");
	}
	
	public void greets(BigDog another)
	{
		System.out.println("Woooooooooow");
	}
		
	// Main de Mammal
    public static void main(String[] args) 
    {
        BigDog d1 = new BigDog("Shadow");
        d1.greets();
   
        Dog d2 = new BigDog("Eclipse");
        d1.greets(d2);
        
        BigDog d3 = new BigDog("DogDay");
        d1.greets(d3);
    }
}
