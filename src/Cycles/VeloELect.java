package Cycles;

class VeloElect extends Velo
{
	private static double DEFAUT_COUPLE_MOTEUR;
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElect(double braquet, double diamRoue, double coupleMoteur)
	{
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElect(double diamRoue, double coupleMoteur)
	{
		super(getDEFAUT_BRAQUET(), diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElect()
	{
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR()
	{
		return DEFAUT_COUPLE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DCM)
	{
		VeloElect.DEFAUT_COUPLE_MOTEUR = DCM;
	}
	
	public double getFacteurPuissanceMoteur()
	{
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur)
	{
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	//@Override
	public String toString()
	{
		return "VeloElect [facteurPuissanceMoteur = " + facteurPuissanceMoteur + "]";
	}
	
	//@Override
	public double getPuissance(double FrequenceCoupsDePedale)
	{
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	//Main de VeloElect
	public static void main(String[] args)
	{
		VeloElect vE1 = new VeloElect (46.0, 98.0, 78.0);
		VeloElect vE2 = new VeloElect ();
			
		System.out.println(vE1);
		System.out.println(vE1.getPuissance(55) + '\n');
		System.out.println(vE2);
		System.out.println(vE2.getPuissance(90)+ '\n');
	}
}
