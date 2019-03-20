
public class Chat {
	private String nom;
	private String race;
	private String couleur;
	private int age;
	private int poids;

	/**
	 * @param nom
	 * @param race
	 * @param couleur
	 * @param age
	 * @param poids
	 */
	public Chat(String nom, String race, String couleur, int age, int poids) {
		super();
		this.nom = nom;
		this.race = race;
		this.couleur = couleur;
		this.age = age;
		this.poids = poids;
	}

	public void miauler() {
		System.out.println("miyaooooo");
	}

	public void courir() {
		System.out.println("je court");
	}

	public void sauter() {
		System.out.println("je saute");
	}

	public void boire() {
		System.out.println("boire");
	}

	public void manger() {
		System.out.println("manger");
	}

	public void jouer() {
		System.out.println("jouer");
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
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

}
