package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Perro;
import operations.Helper;

class TestPerro {

	@Test
	void testCalculoAntibioticos() {
		Perro p1 = new Perro("Nuba", "mestizo", 15, "hembra", "negro y fuego", 12);
		assertEquals(150,Helper.calculoAntibioticos(p1));
	}
	
	@Test
	void testCalculoEdadHumana() {
		Perro p2 = new Perro("Nuba", "mestizo", 15, "hembra", "negro y fuego", 12);
		assertEquals(74.33,Helper.calculoEdadHumana(p2));
	}
}
