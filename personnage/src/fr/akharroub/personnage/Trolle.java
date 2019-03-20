package fr.akharroub.personnage;

public class Trolle extends Personnage {
	@Override
	public void attaques() {
		System.out.println("binge");
	}

	/**
	 * 
	 */
	public Trolle() {
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
	public Trolle(int nombreDeVie, int puissance, String nom, String arme, String type) {
		super(nombreDeVie, puissance, nom, arme, type);
		// TODO Auto-generated constructor stub
	}
}
