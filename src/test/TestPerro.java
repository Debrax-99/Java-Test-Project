package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Perro;
import operations.Helper;

class TestPerro {

	Perro perro = new Perro("Nuba", "mestizo", 15, "hembra", "negro y fuego", 12, 2019);
	
	@Test
	void testCalculoAntibioticos() {		
		assertEquals(150,Helper.calculoAntibioticos(perro));
	}
	
	@Test
	void testCalculoEdadHumana() {
		assertEquals(74.33,Helper.calculoEdadHumana(perro));
	}
	
	@Test
	void testCalculoPienso() {
		assertEquals(100,Helper.calculoPienso(perro));
	}
	
	@Test
	void testComprobarVacuna() {
		assertTrue(Helper.comprobarVacuna(perro) == false);
	}
}
