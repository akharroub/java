package fr.akharroub.calculatrise;

public class Calculatrice {
	public double addition(double nb1, double nb2) {
		return nb1 + nb2;
	}

	public double soustraction(double nb1, double nb2) {
		return nb1 - nb2;
	}

	public double multiplication(double nb1, double nb2) {
		return nb1 * nb2;
	}

	public double division(double nb1, double nb2) {
		return nb1 / nb2;
	}

	public int modulo(int nb1, int nb2) {
		return nb1 % nb2;
	}

	public int doubler(int nb) {
		return nb * 2;
	}

	public int carre(int nb) {
		return nb * nb;
	}

	public double puissance(double nombre1, double nombre2) {
		{
			double result = 1;

			for (double i = 0; i < nombre2; i++) {
				result = result * nombre1;
			}

			return result;
		}
	}

}