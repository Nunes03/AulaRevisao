package br.com.proway.senior.aula.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {

    @Test(expected = Exception.class)
    public void testeSetNomeComNumero() throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("123Lucas");
    }

    @Test(expected = Exception.class)
    public void testeSetNomeComCaracterProibido() throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("Lucas.");
    }

    @Test
    public void testeSetNomeSemNumero() {
        Aluno aluno = new Aluno();
        try {
            aluno.setNome("Lucas");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(aluno.getNome());
    }
    
    @Test(expected = Exception.class)
    public void testeSetSobrenomeComNumero() throws Exception {
        Aluno aluno = new Aluno();
        aluno.setSobrenome("123Nunes");
    }

    @Test(expected = Exception.class)
    public void testeSetSobrenomeComCaracterProibido() throws Exception {
        Aluno aluno = new Aluno();
        aluno.setSobrenome("Nunes.");
    }

    @Test
    public void testeSetSobrenomeSemNumero() {
        Aluno aluno = new Aluno();
        try {
            aluno.setSobrenome("Lucas");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(aluno.getSobrenome());
    }
    
    @Test
    public void testeSetIdadeValida() {
    	Aluno aluno = new Aluno();
    	try {
    		aluno.setIdade(20);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	assertNotNull(aluno.getIdade());
    }
    
    @Test(expected = Exception.class)
    public void testeSetIdadeMaiorQue130() throws Exception {
    	Aluno aluno = new Aluno();
    	aluno.setIdade(131);
    }
}