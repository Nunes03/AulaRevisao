package br.com.proway.senior.aula.model;

/***
 * <h1>Avaliaçõa do desemprenho do {@link Aluno} em uma
 * {@link Materia}</h1>
 *
 * <p>
 * Registra uma avaliação realizada pelo {@link Aluno} relativo ao
 * conhecimento de uma {@link Materia}. O {@link Aluno} poderá
 * realizar várias avaliações da mesma {@link Materia}. A média ponderada
 * das notas das provas é registrada no {@link Boletim}. E verifica se o
 * aluno foi aprovado
 * </p>
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
	private int peso;

	/***
	 * <h1>Avaliação de desempenho do aluno</h1>
	 * 
	 * <p>
	 * No construtor da {@link Prova} não atribui-se valor para nota que seja porrível a
	 * criação de provas para depois serem atribuídas as notas
	 * </p>
	 * 
	 * @param periodo
	 * @param aluno
	 * @param materia
	 * @param nota
	 * 
	 * @author Lucas Nunes
	 * 
	 * @see Prova
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}

	/**
	 * <h1>Valor da avaliação do {@link Aluno}.</h1>
	 * 
	 * @return double referente a nota.
	 * 
	 * @author Lucas Nunes
	 * 
	 * @see Aluno
	 */
	public Double getNota() {
		return nota;
	}

	/***
	 * <h1>Determina a avaliação do {@link Aluno}</h1>
	 * 
	 * <p>
	 * Não pode ser menor que 0 e ne maior do que o atributo
	 * {@link Materia}.notaMaxima
	 * </p>
	 * 
	 * @param nota referente a nota informada.
	 * 
	 * @throws Exception Valor da nota não pode ser menor que 0
	 * ou maior que a {@link Materia}.notaMaxima.
	 * 
	 * @author Lucas Nunes
	 *
	 * @see Aluno
	 * @see Materia
	 */
	public void setNota(Double nota) throws Exception {
		if (nota < 0 || nota > Materia.notaMaxima) {
			throw new Exception("Valor da nota inválido");
		} else {
			this.nota = nota;
		}
	}

	/**
	 * <h1>Periodo da avaliação do {@link Aluno}.</h1>
	 * 
	 * @return Integer referente ao periodo.
	 * 
	 * @author Lucas Nunes
	 * 
	 * @see Aluno
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * <h1>{@link Aluno} da {@link Prova}.</h1>
	 * 
	 * @return Aluno, referente ao {@link Aluno}.
	 * 
	 * @see Aluno
	 * @see Prova
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * <h1>{@link Materia} da {@link Prova}.</h1>
	 * 
	 * @return Materia, referente a {@link Materia}.
	 * 
	 * @author Lucas Nunes
	 * 
	 * @see Materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/***
	 * <h1>Peso da {@link Prova}.</h1>
	 * 
	 * @return int, referente ao peso da {@link Prova}.
	 * 
	 * @author Lucas Nunes
	 * 
	 * @see Prova
	 */
	public int getPeso() {
		return peso;
	}

	
	/***
	 * <h1>Determina o peso da {@link Prova}</h1>
	 * 
	 * <p>
	 * Não pode ser menor que 0 e maior do que o 10.
	 * </p>
	 * 
	 * @param peso, referente ao peso informado.
	 * 
	 * @throws Exception Valor do peso não pode ser menor que 0
	 * ou maior que 10.
	 * 
	 * @author Lucas Nunes
	 *
	 * @see Prova
	 */
	public void setPeso(int peso) throws Exception {
		if(peso < 0 || peso > 10) {
			throw new Exception ("Peso menor que 0 ou maior que 10");
		} else {
			this.peso = peso;
		}
		
	}
}
