package controller;

import model.Perro;
import operations.Helper;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro();

		perro.setNombre("Nuba");
		perro.setEdad(15);
		perro.setSexo("hembra");
		perro.setPeso(12);
		perro.setAnioVacuna(2019);

		System.out.println(perro.toString());
		System.out.println(perro.getNombre() + " necesita una dosis de " + Helper.calculoAntibioticos(perro) + " mg de antibi�tico tres veces al d�a.");
		System.out.println(perro.getNombre() + " necesita comer " + Helper.calculoPienso(perro) + " gr de pienso al d�a.");
		System.out.println(perro.getNombre() + " tiene " + Helper.calculoEdadHumana(perro) + " a�os en equivalencia a la edad humana.");
		if (Helper.comprobarVacuna(perro)) {
			System.out.println(perro.getNombre() + " lleva sus vacunas al d�a.");
		} else {
			System.out.println(perro.getNombre() + " tiene que vacunarse este a�o.");
		}
	}

}
