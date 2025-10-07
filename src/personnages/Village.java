package personnages;

import javax.swing.text.ElementIterator;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois[] chef = new Gaulois[1];
	/* FAIRE LE TABLEAU */
	

	public Village(String nom, int nbVillageois, Gaulois[] chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}

	public Gaulois[] getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		nbVillageois++;
		gaulois.setVillage();
	
	}
	
}
