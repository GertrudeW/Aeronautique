package aeronautique;

public class Pilote {
	private int NUMPIL;
	private String NOM_PIL;
	private int salaire;
	private String adresse;
	
	public Pilote(int numero, String nom, String adresse, int salaire) {
		super();
		this.NUMPIL = numero;
		this.NOM_PIL = nom;
		this.adresse = adresse;
		this.salaire = salaire;
		
	}

	@Override
	public String toString() {
		return "Pilote [NUMPIL=" + NUMPIL + ", NOM_PIL=" + NOM_PIL + ", salaire=" + salaire + ", adresse=" + adresse
				+ "]";
	}
	

}
