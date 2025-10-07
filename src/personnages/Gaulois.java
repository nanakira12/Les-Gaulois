package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = 1;
		this.village = village;
	}

	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}

	public int getEffetPotion() {
		return effetPotion;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix);
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		int coup = force*effetPotion;
		romain.recevoirCoup(coup/3);
		if (effetPotion>1) {
			effetPotion=effetPotion-1;
		}
		else {
			effetPotion=1;
		}
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
	}

}
