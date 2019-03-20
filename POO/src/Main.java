
public class Main {

	public static void main(String[] args) {

		String chaine = "test";
		// String chaine = new String("test");
		// new Gateau(.....); Construction

		new String("test");

		Voiture boumbo = new Voiture();
		boumbo.nom = "Boumbo";

		System.out.println(boumbo.nom);
		System.out.println(boumbo.couleur);
		boumbo.couleur = "BLEU";
		boumbo.nombreDePlaces = 3;
		boumbo.nombreDePortes = 3;
		boumbo.moteur = "X123";

		System.out.println(boumbo.couleur);

		Voiture flash = new Voiture();
		flash.nom = "Flash McQueen";
		flash.nombreDePortes = 2;
		flash.nombreDePlaces = 2;
		flash.moteur = "Z96X";
		flash.couleur = "ROUGE";

		System.out.println(flash.moteur);

		System.out.println(boumbo.nom + " possède " + boumbo.nombreDePlaces + " places");

		System.out.println(flash.nom + " possède " + flash.nombreDePlaces + " places");

		Voiture martin = new Voiture();

		Voiture cars = new Voiture("Flash", 2, 2, "XZ123", "Rouge");

		System.out.println(cars.nom);

		cars.avancer();
		cars.freiner();
		cars.marcheAr();
		cars.freiner();
		System.out.println(cars.couleur);
		cars.changerCouleur("Bleu");
		System.out.println(cars.couleur);

		cars.changerCouleur("Jaune");
		System.out.println(cars.couleur);
	}

}
