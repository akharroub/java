package fr.akharroub.personnage;

public class Mage extends Personnage {

	@Override
	public void attaques() {
		System.out.println("abra kadabra");
	}

	/**
	 * 
	 */
	public Mage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombreDeVie
	 * @param puissance
	 * @param nom
	 * @param arme
	 * @param type
	 */
	public Mage(int nombreDeVie, int puissance, String nom, String arme, String type) {
		super(nombreDeVie, puissance, nom, arme, type);
		// TODO Auto-generated constructor stub
	}
}
