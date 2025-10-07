package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public void remplirChaudron(int quantite, int force) {
		quantitePotion=quantite;
		forcePotion=force;
	}
	
	public boolean resterPotion() {
		return quantitePotion>0;
	}
	
	public int prendreLouche() {
		quantitePotion-=1;
		if (quantitePotion<=0) {
			quantitePotion=0;
		}
		return quantitePotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	
}
