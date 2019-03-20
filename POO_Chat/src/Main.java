
public class Main {

	public static void main(String[] args) {

		Chat garfield = new Chat("Garfield", "Chat de goutti�re", "Orange", 5, 15);
		Chat felix = new Chat("F�lix", "Abyssin", "Noire", 3, 5);
		Chat tom = new Chat("Tom", "Bengal", "Gris", 4, 9);
		Chat oggy = new Chat("Oggy", "Birman", "Bleu", 8, 11);

		System.out.println("le chat: " + garfield.getNom() + " a " + garfield.getAge() + " ans.");

		garfield.setAge(6);
		System.out.println("le chat: " + garfield.getNom() + " a " + garfield.getAge() + " ans.");

		if (garfield.getAge() > felix.getAge()) {
			System.out.println("Le chat Garfield est plus ag� que F�lix");
		}

		System.out.println("Age de Garfield : " + garfield.getAge());
		System.out.println("Age de F�lix: " + felix.getAge());

		String raceFelix = felix.getRace();
		String tomRace = tom.getRace();

		if (raceFelix.equals(tomRace)) {
			System.out.println("Tom et F�lix sont de la m�me race");
		} else {
			System.out.println("Tom et F�lix ne sont pas de la m�me race!");
		}
		int garfieldpoids = garfield.getPoids();
		int oggypoids = oggy.getPoids();

		if (garfieldpoids < oggypoids) {
			System.out.println("oggy est ob�se");
		} else {
			System.out.println("garfield est ob�se");
		}
		if (garfieldpoids > 10) {
			garfield.courir();
		} else {
			garfield.manger();
		}

		for (int i = 1; i <= 5; i++) {
			tom.sauter();
		}
		System.out.println("____________________________________");
		for (int i = 0; i < garfield.getPoids(); i++) {
			garfield.sauter();
		}
		System.out.println("____________________________________");

		String couleurtom = tom.getCouleur();
		String couleuroggy = oggy.getCouleur();

		tom.setCouleur(couleuroggy);
		System.out.println(tom.getCouleur());
		oggy.setCouleur(couleurtom);
		System.out.println(oggy.getCouleur());

	}

}
