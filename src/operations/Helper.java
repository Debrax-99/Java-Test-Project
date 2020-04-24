package operations;

import java.time.LocalDateTime;

import model.Perro;

public class Helper {
	
	//CALCULATE ANTIBIOTIC DOSE
	public static double calculoAntibioticos(final Perro perro) {
		//Formula antibioticos: 12'5 mg de sustancia activa por kg de peso.
		final double antibioticos = perro.getPeso() * 12.5;
		return antibioticos;
	}
	
	//CALCULATE DAILY FEED AMOUNT
	public static int calculoPienso(final Perro perro) {
		//Cantidad pienso segun edad y peso, para cachorros, adultos y seniors.
		int pienso = 0;
		//Comprobamos elrango de edad del perro, y ajustamos cantidad segun peso.
		if ((perro.getEdad() >= 1) && (perro.getEdad() < 9)) {
			pienso = piensoAdultos(perro);
		} else {
			if (perro.getEdad() < 1) {
				pienso = 25;
			} else {
				pienso = piensoSeniors(perro);
			}
		}
		return pienso;
	}

	//Cantidad de pienso por kilo de peso para adultos
	private static int piensoAdultos(final Perro perro) {
		int pienso;
		if (perro.getPeso() <= 5) {
			pienso = 40;
		} else {
			if (perro.getPeso() <= 12) {
				pienso = 130;
			} else {
				if (perro.getPeso() <= 25) {
					pienso = 400;
				} else {
					if (perro.getPeso() <= 45) {
						pienso = 700;
					} else {
						pienso = 1000;
					}
				}
			}
		}
		return pienso;
	}
	
	//Cantidad de pienso por kilo de peso para seniors
	private static int piensoSeniors(final Perro perro) {
		int pienso;
		if (perro.getPeso() <= 5) {
			pienso = 35;
		} else {
			if (perro.getPeso() <= 12) {
				pienso = 100;
			} else {
				if (perro.getPeso() <= 25) {
					pienso = 350;
				} else {
					if (perro.getPeso() <= 45) {
						pienso = 550;
					} else {
						pienso = 800;
					}
				}
			}
		}
		return pienso;
	}

	//CALCULATE AGE ON HUMAN YEARS
	public static double calculoEdadHumana(final Perro perro) {
		//Formula de equivalencia de edad perro-humano: ln de la edad por 16 mas 31, siempre que tenga mas de 1 anio.
		double edadHumana = 0;
		if (perro.getEdad() > 1) {
			edadHumana = redondeoDos(Math.log(perro.getEdad()) * 16 + 31);
		} else {
			edadHumana = 31;
		}
		return edadHumana;
	}
	
	//CHECK VACCINE SCHEDULE STATUS
	public static boolean comprobarVacuna(final Perro perro) {
		//Si el anio de ultima vacuna no coincide con el del sistema, la vacuna está desactualizada y ha de vacunarse.
		LocalDateTime now = LocalDateTime.now();
		boolean vacuna = false;
		if (perro.getAnioVacuna() == now.getYear()) {
			vacuna = true;
		}		
		return vacuna;
	}
	
	//ROUNDING TWO DECIMALS
	private static double redondeoDos(final double num) {
		final double numDec = Math.round(Math.pow(10,2)*num)/Math.pow(10,2);
		return numDec;
	}

}
