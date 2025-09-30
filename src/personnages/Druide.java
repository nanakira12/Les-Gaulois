package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte +"\"");
	}
	
	public void booster(Gaulois gaulois) {
		String NomGaulois = gaulois.getNom();
		if (chaudron.resterPotion()) {
			if (NomGaulois == "Obélix") {
					parler("Non, " + NomGaulois + ". Non ! Et tu le sais très bien !");	
			}
			else {
				chaudron.prendreLouche();
				parler("Tiens " + NomGaulois + " un peu de potion magique.");
			}
		}
		else parler("Désolé " + NomGaulois + " il n'y a plus une seule goutte de potion.");
	}
	
	public void fabriquerPotion(int quantité, int forcePotion) {
		chaudron.remplirChaudron(quantité,forcePotion);
		parler("J'ai concocté " + quantité + " doses de potion magique. Elle a une force de " + forcePotion +".");
	}
	
}
