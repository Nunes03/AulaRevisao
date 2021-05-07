package br.com.senior.grupo.aula.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorsTest {
	
	@Test
	public void testeConstrutorValidators() {
		Validators vali = new Validators();
	}
	
	@Test
	public void testOnlyChars() {
		assertTrue(Validators.validateOnlyValidChars("dbsjirfeguwirtbewuigfbreio"));
	}
	
	@Test
	public void testOnlyCharsRecebendoNumeros() {
		assertFalse(Validators.validateOnlyValidChars("dsadsa12233"));
	}

	@Test
	public void testOnlyCharsRecebendoCaracteresEspeciais() {
		assertFalse(Validators.validateOnlyValidChars("fndui..;/.;/"));
	}
}