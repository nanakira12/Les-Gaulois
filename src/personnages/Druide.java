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
			if (NomGaulois == "Ob�lix") {
					parler("Non, " + NomGaulois + ". Non ! Et tu le sais tr�s bien !");	
			}
			else {
				chaudron.prendreLouche();
				parler("Tiens " + NomGaulois + " un peu de potion magique.");
			}
		}
		else parler("D�sol� " + NomGaulois + " il n'y a plus une seule goutte de potion.");
	}
	
	public void fabriquerPotion(int quantit�, int forcePotion) {
		chaudron.remplirChaudron(quantit�,forcePotion);
		parler("J'ai concoct� " + quantit� + " doses de potion magique. Elle a une force de " + forcePotion +".");
	}
	
}
