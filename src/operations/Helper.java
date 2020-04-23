package operations;

import model.Perro;

public class Helper {
	
	public static double calculoAntibioticos (Perro perro) {
		//Fórmula antibióticos: 12'5 mg de sustancia activa por kg de peso
		double antibioticos = perro.getPeso() * 12.5;
		return antibioticos;
	}

	public static double calculoEdadHumana (Perro perro) {
		//Fórmula de equivalencia de edad perro-humano: ln de la edad por 16 más 31, siempre que tenga más de 1 año.
		double edadHumana = 0;
		if (perro.getEdad() > 1) {
			edadHumana = (Math.round(Math.pow(10,2)*(Math.log(perro.getEdad()) * 16 + 31))/Math.pow(10,2));
		} else {
			edadHumana = 31;
		}
		return edadHumana;
	}

}
