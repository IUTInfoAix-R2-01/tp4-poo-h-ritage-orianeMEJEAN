package tp3exosYaip4;

public class Person 
{
    private String name;
    private String adress;
    
    public Person(String n, String ad) 
    {  
        this.name = n;
        this.adress = ad;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getAdress() 
    {
        return adress;
    }
    
    public void setAdress(String ad) 
    {
        this.adress = ad;
    }
    
    public String toString() 
    {
        return "Person [name = " + name + ", adress = " + adress + "]";
    }
    
    // Main de Person
    public static void main(String[] args) 
    {
        Person p1 = new Person("Ichi", "123 Rue de Belgique");  //fausse adress
        System.out.println(p1);
        
        p1.setAdress("456 Rue de Belgique");  //fausse adress
        System.out.println(p1);

        System.out.println(p1.getName());
        System.out.println(p1.getAdress());
    }
}
