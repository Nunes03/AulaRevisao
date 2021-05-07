package br.com.proway.senior.aula.model;
/***
 * <h1>Avalia��a do desemprenho do Aluno{@link Aluno} em uma Materia{@link Materia}</h1>
 *
 * <p>Registra uma avalia��o realizada pelo Aluno{@link Aluno} relativo
 * ao conhecimento de uma Materia{@link Materia}. O Aluno{@link Aluno} 
 * poder� realizar v�rias avalia��es da mesma Materia{@link Materia}.
 * A m�dia ponderada das notas das provas � registrada no Boletim{@link Boletim}.
 *  E verifica se o aluno foi aprovado</p>
 *
 * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
 * @see Aluno
 * @see Boletim
 * @see Materia
 */
public class Prova {
	private Integer periodo;
	private Aluno aluno;
	private Materia materia;
	private Double nota;
	
	/***
	 * <h1>Avalia��o de desempenho do aluno</h1>
	 * 
	 * <p>No construtor da prova n�o atribui-se valor para nota que seja
	 * porr�vel a cria��o de provas para depois serem atribu�das as notas</p>
	 * 
	 * @param periodo
	 * @param aluno
	 * @param materia
	 * @param nota
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}

	/**
	 * <h1>Valor da avalia��o do aluno.</h1>
	 * 
	 * @return double referente a nota.
	 */
	public Double getNota() {
		return nota;
	}
	
	/***
	 * <h1>Determina a avalia��o do aluno</h1>
	 * 
	 * <p>N�o pode ser menor que 0 e ne maior do que o atributo Materia.notaMaxima{@link Materia.notaMaxia}</p>
	 * 
	 * @param nota referente a nota informada.
	 */
	public void setNota(Double nota) throws Exception{
		if(nota < 0 || nota > Materia.notaMaxima) {
			throw new Exception ("Valor da nota inv�lido");
		} else {
			this.nota = nota;
		}
	}

	/**
	 * <h1>Periodo da avalia��o do {@link Aluno}.</h1>
	 * 
	 * @return Integer referente ao periodo.
	 * @see Aluno
	 */
	public Integer getPeriodo() {
		return periodo;
	}
	
	/**
	 * <h1>{@link Aluno} da prova.</h1>
	 * 
	 * @return Aluno referente ao {@link Aluno}.
	 * @see Aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * <h1>{@link Materia} da prova.</h1>
	 * 
	 * @return Materia referente a {@link Materia}.
	 * @see Materia
	 */
	public Materia getMateria() {
		return materia;
	}
}
