package br.com.proway.senior.aula.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class ProvaTest {

	static Prova prova;
	static int periodoParam = 202105;

	@BeforeClass
	public static void createProva() {
		Integer periodo = periodoParam;
		Materia materia = new Materia();
		Aluno aluno = new Aluno();
		prova = new Prova(periodo, aluno, materia);
	}

	@Test
	public void testeProva() {
		assertNotNull(prova);
	}

	@Test
	public void testeGetNotaCorreto() {
		try {
			this.prova.setNota(10.0);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals(10.0, (double) this.prova.getNota(), 0.1);
	}

	@Test(expected = Exception.class)
	public void testeGetNotaIncorreto() throws Exception {
		this.prova.setNota(-10.0);
	}

	@Test
	public void testGetPeriodo() {
		assertEquals(periodoParam, (int) prova.getPeriodo());
	}

	@Test
	public void testGetAluno() {
		assertNotNull(prova.getAluno());
	}

	@Test
	public void testGetMateria() {
		assertNotNull(prova.getMateria());
	}

}
