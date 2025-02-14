package tp3exosYaip4;

public class Person 
{
	private static String name;
	private static String adress;
	
	public Person(String n, String ad)
	{
		Person.name = n;
		Person.adress = ad;
	}
	
	public static String getName()
	{
		return name;
	}
	
	public static String getAdress()
	{
		return adress;
	}
	
	public void setAdress(String ad)
	{
		Person.adress = ad;
	}
	
	public String toString()
	{
		return "Person [name = " + name + ", adress = " + adress + "]";
	}
	
	//Main de Person
	public static void main(String[] args)
	{
		Person p1 = new Person("Ichi", "123 Rue de Belgique"); //fausse adresse
        System.out.println(p1);
        
        p1.setAdress("456 Rue de Belgique"); //fausse adresse
        System.out.println(p1);
        
        System.out.println(Person.getName());
        System.out.println(Person.getAdress());
	}
}
