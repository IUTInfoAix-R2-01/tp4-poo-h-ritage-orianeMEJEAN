package Cycles;

import java.util.Random;

public class Velo 
{
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public static double getDEFAUT_BRAQUET()
	{
		return DEFAUT_BRAQUET;
	}
	
	public void setDEFAUT_BRAQUET(double DB)
	{
		Velo.DEFAUT_BRAQUET = DB;
	}
	
	public Velo(double braquet, double diamRoue)
	{
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = new Random();
	}
	
	public Velo(double braquet)
	{
		this.braquet = braquet;
	}
	
	public Velo()
	{
		this(DEFAUT_BRAQUET, DEFAUT_BRAQUET);
	}
	
	public Random getGenAlea()
	{
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea)
	{
		this.genAlea = new Random();
	}
	
	public double getBraquet()
	{
		return braquet;
	}
	
	public void setBraquet(double braquet)
	{
		this.braquet = braquet;
	}
	
	public double getDiamRoue()
	{
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue)
	{
		this.diamRoue = diamRoue;
	}
	
	public String toString()
	{
		return "Velo [braquet = " + braquet + ", diamRoue = " + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale)
	{
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble(); 
	}
	
	
	//Main de Velo
	public static void main(String[] args)
	{
		Velo v1 = new Velo (14.0, 25.0);
		Velo v2 = new Velo ();
		
		System.out.println(v1);
		System.out.println(v1.getPuissance(76) + '\n');
		System.out.println(v2);
		System.out.println(v2.getPuissance(66)+ '\n');
	}
}
