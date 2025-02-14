package tp3exosYaip4;

class Student extends Person 
{
    private String program;
    private int year;
    private double fee;
    
    public Student(Person person, String prog, int y, double fee) 
    {
        super(person.getName(), person.getAdress());
        this.program = prog;
        this.year = y;
        this.fee = fee;
    }
    
    public String getProgram() 
    {
        return program;
    }
    
    public void setProgram(String prog) 
    {
        this.program = prog;
    }
    
    public double getFee() 
    {
        return fee;
    }
    
    public void setFee(double fee) 
    {
        this.fee = fee;
    }
    
    public int getYear() 
    {
        return year;
    }
    
    public void setYear(int y) 
    {
        this.year = y;
    }
    
    @Override
    public String toString() 
    {
        return "Student [" + super.toString() + ", program = " + program + ", year = " + year + ", fee = " + fee + "]";
    }

    // Main de Student
    public static void main(String[] args) 
    {
        Person p1 = new Person("Lou Contrucci", "somewhere in the universe");
        Student s1 = new Student(p1, "Informatique", 1, 55);
        System.out.println(s1.toString());
        
        s1.setProgram("Web");
        s1.setYear(2);
        s1.setFee(32);
        System.out.println(s1.toString());
    }
}
