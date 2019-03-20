package fr.mohamed.animal;

import fr.mohamed.animal.volent.Autruche;

public class Main {

	public static void main(String[] args) {
		Autruche chocho = new Autruche("chocho", "noir", "harbivore", 1, 12, true);
		System.out.println(chocho.getNom());
		chocho.boire();
		chocho.courir();
		chocho.dormir();
		chocho.manger();
	}

}
