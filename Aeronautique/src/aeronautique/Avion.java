package aeronautique;

public class Avion {

	private int NUMAV;
	private String NOM_AV;
	private int capacite;
	private String loc;
	
	
	public Avion(int numero, String nom, String localisation, int capa ) {
		super();
		this.NUMAV = numero;
		this.NOM_AV = nom;
		this.capacite = capa;
		this.loc = localisation;
		
	}


	@Override
	public String toString() {
		return "Avion [NUMAV=" + NUMAV + ", NOM_AV=" + NOM_AV + ", capacite=" + capacite + ", loc=" + loc + "]";
	}
	
	
	
}
