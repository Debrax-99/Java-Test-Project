package controller;

import model.Perro;
import operations.Helper;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro();

		perro.setNombre("Nuba");
		perro.setRaza("mestizo");
		perro.setEdad(15);
		perro.setSexo("hembra");
		perro.setPeso(12);		

		System.out.println(perro.toString());
		System.out.println("El perro tiene " + Helper.calculoEdadHumana(perro) + " años de edad equivalente a la humana.");
	}

}
