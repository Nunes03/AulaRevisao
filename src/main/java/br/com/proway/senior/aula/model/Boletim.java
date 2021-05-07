package br.com.proway.senior.aula.model;

import java.util.ArrayList;

/***
 * <h1>Reune as {@link Provas} de um {@link Aluno}.</h1>
 *
 * <p>
 * O {@link Boletim} possui uma lista de {@link Prova} e é referente a um
 * periodo. Para cada período é calculada a média das provas que resulta na nota
 * do {@link Boletim}
 * </p>
 *
 * @author Lucas Nunes <lucasnunes.ln365@gmail.com>
 * @see Aluno
 * @see Boletim
 * @see Prova
 */
public class Boletim {
	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private static ArrayList<Prova> provas;

	/***
	 * <h1>Cria um novo {@link Boletim}</h1>
	 * 
	 * <p>
	 * O {@link Boletim} é criado a partir de um {@link Aluno} e um período.
	 * Conforme as {@link Prova} são adicionadas, realiza-se o cálculo atualizado da
	 * média.
	 * </p>
	 * 
	 * @param aluno
	 * @param periodo
	 * @param media
	 * @param provas
	 * 
	 * @see Aluno
	 * @see Boletim
	 * @see Pova
	 */
	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
	}

	/**
	 * <h1>{@link Aluno} do {@link Boletim}</h1>
	 * 
	 * @return Aluno referente ao {@link Aluno}
	 * @see Aluno
	 * @see Boletim
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * <h1>Periodo do {@link Boletim} no formato YYYYMM</h1>
	 * 
	 * @return Integer referente ao periodo
	 * @see Boletim
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * <h1>Retorna a média das {@link Prova} atualizadas.</h1>
	 * 
	 * @return Double referente a media
	 * @see Prova
	 */
	public Double getMedia() {
		return media;
	}

	/**
	 * <h1>Retorna todas as {@link Prova}</h1>
	 * 
	 * @return ArrayList<Prova> referente a todas as provas
	 * @see Prova
	 */
	public ArrayList<Prova> getProvas() {
		return provas;
	}

	/**
	 * <h1>Adiciona uma avaliaçõa ao {@link Boletim}</h1>
	 * 
	 * <p>
	 * Ao adicionar a {@link Prova} a média é recalculada
	 * </p>
	 * 
	 * @param prova Prova, referente a {@link Pova} informada
	 * 
	 * @see Prova
	 * @see Boletim
	 */
	public void addProva(Prova prova) throws Exception {
		if (prova == null) {
			throw new Exception("Prova inválida");
		} else {
			provas.add(prova);
		}
	}

	/**
	 * <h1>Remove uma avaliação do {@link Boletim}.</h1>
	 * 
	 * <p>
	 * Ao remover a {@link Prova}, a média é recalculada.
	 * </p>
	 * 
	 * @param index int, referente ao index do ArrayList.
	 * 
	 * @see Boletim
	 * @see Prova
	 */
	public void removeProva(int index) throws Exception {
		System.out.println(provas);
		if (index < 0 || index > provas.size()) {
			throw new Exception("Posição inválida");
		} else {
			provas.remove(index);
		}
	}

	/**
	 * <h1>Remove todas as provas.</h1>
	 * 
	 */
	public void removeTodasProvas() {
		ArrayList<Prova> provas = new ArrayList<Prova>();
		this.provas = provas;
	}

	/**
	 * <h1>Calcula a média ponderada das {@link Prova}.</h1>
	 * 
	 * <p>
	 * Realiza o cálculo da média das notas das {@link Prova} e atualiza o valor da
	 * media.
	 * </p>
	 * 
	 * @see Prova
	 */
	public void calcularMedia() {
		Double soma = 0.0;
		for (Prova prova : provas) {
			soma += prova.getNota();
		}
		this.media = (soma / provas.size());
	}

}
