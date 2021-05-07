package br.com.proway.senior.aula.model;

import br.com.senior.grupo.aula.utils.Validators;

/***
 * <h1>Pessoa que estuda na escola</h1>
 *
 * <p>Um aluno é uma pessoa que estuda na escola. O aluno frequenta uma Turma{@link Turma}
 * tem Nota{@link Nota} e Boletim{@link Boletim}</p>
 *
 * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
 * @see Turma
 * @see Nota
 * @see Boletim
 */
public class Aluno {

    private String nome;

    private String sobrenome;

    private Integer idade;

    /**
     * <h1>Primeiro nome do aluno.</h1>
     *
     */
    public String getNome() {
        return nome;
    }

    /**
     * <h1>Primeiro nome do aluno.</h1>
     *
     * <p>Utilizar apenas caracteres alfabéticos</p>
     *
     * @throws Exception Não utilize numeros ou caracteres especiais no nome do aluno.
     */
    public void setNome(String nome) throws Exception {
        //Reirar o que não é alfabético
        if(!Validators.validateOnlyValidChars(nome)) {
        	throw new Exception("Não use caracteres não alfabéticos.");
        } 
        this.nome = nome;
    }

    /**
     * <h1>Ultimo sobrenome do aluno</h1>
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * <h1>Ultimo nome do aluno.</h1>
     *
     * <p>Utilizar apenas caracteres alfabéticos</p>
     *
     * @throws Exception Não utilize numeros ou caracteres especiais no sobrenome do aluno.
     */
    public void setSobrenome(String sobrenome) throws Exception {
    	if(!Validators.validateOnlyValidChars(sobrenome)) {
        	throw new Exception("Não use caracteres não alfabéticos.");
        } 
        this.sobrenome = sobrenome;
    }

    /**
     * <h1>Idade do aluno</h1>
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * <h1>Define a idade do aluno</h1>
     */
    public void setIdade(Integer idade) throws Exception{
         if(idade < 0 || idade > 130){
             throw new Exception ("Idade menor que 0 ou maior que 130");
         }
        this.idade = idade;
    }
}