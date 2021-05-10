package br.com.proway.senior.aula.model;

import br.com.senior.grupo.aula.utils.Validators;

/***
 * <h1>Pessoa que estuda na escola</h1>
 *
 * <p>Um {@link Aluno} � uma pessoa que estuda na escola.
 *  O aluno frequenta uma {@link Turma}, tem {@link Nota}
 *  e {@link Boletim}</p>
 *
 * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
 * 
 * @see Turma
 * @see Nota
 * @see Boletim
 */
public class Aluno {

    private String nome;

    private String sobrenome;

    private Integer idade;

    /**
     * <h1>Primeiro nome do {@link Aluno}.</h1>
     * 
     * @see Aluno
     * 
     * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
     */
    public String getNome() {
        return nome;
    }

    /**
     * <h1>Primeiro nome do {@link Aluno}.</h1>
     *
     * <p>Utilizar apenas caracteres alfab�ticos.</p>
     * 
     * @param nome String, referente ao primeiro nome informado.
     * 
     * @throws Exception N�o utilize n�meros ou caracteres especiais no nome do {@link Aluno}.
     * 
     * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
     * 
     * @see Aluno
     */
    public void setNome(String nome) throws Exception {
        //Reirar o que n�o � alfab�tico
        if(!Validators.validateOnlyValidChars(nome)) {
        	throw new Exception("N�o use caracteres n�o alfab�ticos.");
        } 
        this.nome = nome;
    }

    /**
     * <h1>Ultimo sobrenome do {@link Aluno}</h1>
     * 
     * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
     * 
     * @see Aluno
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * <h1>Ultimo nome do {@link Aluno}.</h1>
     *
     * <p>Utilizar apenas caracteres alfab�ticos</p>
     *
     * @param sobrenome String, referente ao �ltimo sobrenome informado.
     * 
     * @throws Exception N�o utilize n�meros ou caracteres especiais no sobrenome do {@link Aluno}.
     * 
     * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
     * 
     * @see Aluno
     */
    public void setSobrenome(String sobrenome) throws Exception {
    	if(!Validators.validateOnlyValidChars(sobrenome)) {
        	throw new Exception("N�o use caracteres n�o alfab�ticos.");
        } 
        this.sobrenome = sobrenome;
    }

    /**
     * <h1>Idade do {@link Aluno}</h1>
     * 
     * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
     * 
     * @see Aluno
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * <h1>Define a idade do {@link Aluno}</h1>
     * 
     * <p>Idade n�o pode ser menor que 0 ou maior que 130</p>
     * 
     * @param idade Integer, referente a idade informada.
     * 
     * @throws Exception Idade menor que 0 ou maior que 130.
     * 
     * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
     * 
     * @see Aluno
     */
    public void setIdade(Integer idade) throws Exception{
         if(idade < 0 || idade > 130){
             throw new Exception ("Idade menor que 0 ou maior que 130");
         }
        this.idade = idade;
    }
}