package tp3exosYaip4;


class Staff extends Person
{
	private Person person;
	private String school;
	private double pay;
	
	public Staff(Person person, String school, double p)
	{
		super(person.getName(), person.getAdress());
		this.school = school;
		this.pay = p;
	}
	
	public String getSchool()
	{
		return school;
	}
	
	public void setSchool(String school)
	{
		this.school = school;
	}
	
	public double getPay()
	{
		return pay;
	}
	
	public void setPay(double p)
	{
		this.pay = p;
	}
	
	@Override
	public String toString()
	{
		return "Staff [" + super.toString() + ", school = " + school + ", pay = " + pay + "]";
	}
	
	//Main de Staff
	public static void main(String[] args)
	{
		Person p1 = new Person("Agostinellie Laurence", "quelque part d'inconnue");
		Staff st1 = new Staff(p1, "IUT d'Aix", 50000.0);
		System.out.println(st1.toString());

	    st1.setSchool("Université");
	    st1.setPay(55000.0);
	    System.out.println(st1.toString());
	}
}
