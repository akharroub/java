public class Voiture {
	private String nom;
	private int nombreDePortes;
	private int nombreDePlaces;
	private String moteur;
	private String couleur;

	// Constructeur sans params
	public Voiture() {
		super();
	}

	// Constructeur avec Params
	public Voiture(String nom, int nombreDePortes, int nombreDePlaces, String moteur, String couleur) {
		super();
		this.nom = nom;
		this.nombreDePortes = nombreDePortes;
		this.nombreDePlaces = nombreDePlaces;
		this.moteur = moteur;
		this.couleur = couleur;
	}

	public void avancer() {
		System.out.println("Vrooooommmm");
	}

	public void freiner() {
		System.out.println("Stop!");
	}

	public void marcheAr() {
		System.out.println("Marche arri�re");
	}

	public void tourner() {
		System.out.println("Je tourne");
	}

	public void changerCouleur(String nouvelleCouleur) {
		couleur = nouvelleCouleur;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nombreDePortes
	 */
	public int getNombreDePortes() {
		return nombreDePortes;
	}

	/**
	 * @param nombreDePortes the nombreDePortes to set
	 */
	public void setNombreDePortes(int nombreDePortes) {
		this.nombreDePortes = nombreDePortes;
	}

	/**
	 * @return the nombreDePlaces
	 */
	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	/**
	 * @param nombreDePlaces the nombreDePlaces to set
	 */
	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}

	/**
	 * @return the moteur
	 */
	public String getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
