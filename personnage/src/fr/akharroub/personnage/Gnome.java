package fr.akharroub.personnage;

public class Gnome extends Personnage {
	@Override
	public void attaques() {
		System.out.println("suipe");
	}

	/**
	 * 
	 */
	public Gnome() {
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
	public Gnome(int nombreDeVie, int puissance, String nom, String arme, String type) {
		super(nombreDeVie, puissance, nom, arme, type);
		// TODO Auto-generated constructor stub
	}
}
