package br.com.academia.certificacaoJava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* Java Naming conventions
    - Nomes de classes devem ser declaradas com Letras Maiúsculas;
    - Usar substantivo para Classes e atributos;
    - Usar adjetivo nas Interfaces
    - Usar verbo metódos, indicação de ação
 * 
*/
public class StringTest {
    /*
     * Variáveis
     * - Não ter espaço em branco;
     * - Não iniciar com &, $ e _
     * - Usar camelCase
     */

    final static String CONSTANTE = "Certificação";

    @Test
    void treinar_metodos_da_classe_String() {
        String variavel = "Certificação";
        // criando instancia - Não é usado na prática
        String instancia = new String("Certificação");

        // Comparação de conteúdo == valores
        assertEquals(CONSTANTE, instancia);
        assertEquals(CONSTANTE, variavel);

        // Tamanho da string
        assertEquals(12, CONSTANTE.length());

        //
    }

}
