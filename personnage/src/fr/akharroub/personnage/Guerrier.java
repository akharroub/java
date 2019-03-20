package fr.akharroub.personnage;

public class Guerrier extends Personnage {

	@Override
	public void attaques() {
		System.out.println("boooom");
	}

	/**
	 * 
	 */
	public Guerrier() {
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
	public Guerrier(int nombreDeVie, int puissance, String nom, String arme, String type) {
		super(nombreDeVie, puissance, nom, arme, type);
		// TODO Auto-generated constructor stub
	}
}
