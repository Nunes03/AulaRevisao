package br.com.senior.grupo.aula.utils;
/***
 * <h1>Utilit�rios do sistema</h1>
 *
 * <p>Esta classe � utilizada para definir m�todos que s�o
 * utlit�rios de diversos m�todos do sistema</p>
 */
public class Validators{
    /***
     * <h1>Verifica se h� caracteres n�o alfab�ticos</h1>
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
