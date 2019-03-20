package fr.akharroub.calculatrise;

public class Main {

	public static void main(String[] args) {
		double nombre1 = 13;
		double nombre2 = 24;
		Calculatrice maCalculatrice = new Calculatrice();

		System.out.println("Addition:");
		double resultatAddition = maCalculatrice.addition(nombre1, nombre2);
		System.out.println(resultatAddition);

		System.out.println("Soustraction:");
		double resultatSoustraction = maCalculatrice.soustraction(nombre1, nombre2);
		System.out.println(resultatSoustraction);

		System.out.println("multiplication:");
		double resultatMultiplication = maCalculatrice.multiplication(nombre1, nombre2);
		System.out.println(resultatMultiplication);

		System.out.println("Division:");
		double resultatDivision = maCalculatrice.division(nombre1, nombre2);
		System.out.println(resultatDivision);

		int entier1 = 12;
		int entier2 = 2;
		System.out.println("Modulo");
		int resultatModulo = maCalculatrice.modulo(entier1, entier2);
		System.out.println(resultatModulo);

		System.out.println("DOUBLE");
		int resultatDouble = maCalculatrice.doubler(15);
		System.out.println(resultatDouble);

		System.out.println("CARRE");
		int resultatCarre = maCalculatrice.carre(120);
		System.out.println(resultatCarre);

		System.out.println("Puissance");
		double resultatPuissance = maCalculatrice.puissance(3, 3);
		System.out.println(resultatPuissance);

	}

}
