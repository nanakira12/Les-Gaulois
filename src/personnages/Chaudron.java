package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion=quantite;
		forcePotion=forcePotion;	
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
	
	
}
