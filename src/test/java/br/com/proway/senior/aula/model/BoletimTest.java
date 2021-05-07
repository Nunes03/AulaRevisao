package br.com.proway.senior.aula.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class BoletimTest {
	
	static Boletim boletim ;
	private static int periodoPadrao= 202105;
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		Aluno aluno = new Aluno();
		Integer periodo = periodoPadrao;
		boletim = new Boletim(aluno, periodo);
	}
	
	@Test
	public void testeBoletim() {
		assertNotNull(boletim);
	}
	
	@Test
	public void testeGetAluno(){
		assertNotNull(boletim.getAluno());
	}
	
	@Test
	public void testeGetPeriodo(){
		assertNotNull(boletim.getPeriodo());
	}
	
	@Test
	public void testeGetMedia(){
		boletim.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		try {
			prova.setNota(10.0);
			boletim.addProva(prova);
			boletim.calcularMedia();
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals(10.0, boletim.getMedia(), 0.01);
	}
	
	@Test
	public void testeGetProvas() {
		assertNotNull(boletim.getProvas());
	}
	
	//________________________________________________________________________
	@Test
	public void testeAddProvaCorreto() {
		boletim.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		try {
			boletim.addProva(prova);
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1, (int) boletim.getProvas().size());
	}
	
	@Test(expected = Exception.class)
	public void testeAddProvaIncorreto() throws Exception{
		Prova prova = null;
		boletim.addProva(prova);
	}
	
	//________________________________________________________________________
	@Test
	public void testeRemoveProvaCorreto() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		try {
			boletim.addProva(prova);
			boletim.removeProva(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(1, (int) boletim.getProvas().size());
	}
	
	@Test(expected = Exception.class)
	public void testeRemoveProvaIncorretoValorMenor() throws Exception{	
		boletim.removeProva(-1);

	}
	
	@Test(expected = Exception.class)
	public void testeRemoveProvaIncorretoValorMaior() throws Exception{	
		boletim.removeProva(1);
	}
	
	//________________________________________________________________________
	@Test
	public void testeRemoveTodasAsProvas() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		
		try {
			boletim.addProva(prova);
			boletim.addProva(prova2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		boletim.removeTodasProvas();
		assertEquals(0, (int) boletim.getProvas().size());
	}
	
	//________________________________________________________________________
	@Test
	public void testeCalcularMedia() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		try {
			prova.setNota(10.0);
			prova2.setNota(9.0);
			
			boletim.addProva(prova);
			boletim.addProva(prova2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		boletim.calcularMedia();
		assertEquals(9.5, (double) boletim.getMedia(),0.1);
	}
}
