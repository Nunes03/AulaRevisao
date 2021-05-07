package br.com.senior.grupo.aula.utils;
/***
 * <h1>Utilitários do sistema</h1>
 *
 * <p>Esta classe é utilizada para definir métodos que são
 * utlitários de diversos métodos do sistema</p>
 */
public class Validators{
    /***
     * <h1>Verifica se há caracteres não alfabéticos</h1>
     *
     * <p>Recebe uma String e verifica se existe algum numero
     * ou caracter especial. Retorna boolean true se tiver algo.</p>
     *
     * @param verify String, referente a String a ser verificada
     * @return boolean true se tiver algum caracter especial ou numero na string.
     */
    public static boolean validateOnlyValidChars(String verify) {
        return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\\\"\\\\\\|,.<>\\/?]+.*");
    }
}
