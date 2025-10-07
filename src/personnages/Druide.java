package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron(0,0);
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
		String nomGaulois = gaulois.getNom();
		if (chaudron.resterPotion()) {
			if (nomGaulois=="Obélix") {
					parler("Non, " + nomGaulois + ". Non ! Et tu le sais très bien !");	
			}
			else {
				int p=chaudron.getForcePotion();
				gaulois.boirePotion(p);
				chaudron.prendreLouche();
				parler("Tiens " + nomGaulois + " un peu de potion magique.");
			}
		}
		else parler("Désolé " + nomGaulois + " il n'y a plus une seule goutte de potion.");
	}
	
	public void fabriquerPotion(int quantite, int forceP) {
		chaudron.remplirChaudron(quantite,forceP);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forceP +".");
	}
	
}
