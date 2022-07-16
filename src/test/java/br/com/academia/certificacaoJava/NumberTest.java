package br.com.academia.certificacaoJava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
Autoboxing e Unboxing
pensa na classe(Wrappers) como uma caixa q tem um tipo primitivo dentro
primitivo (conteudo da caixa) -> classe (caixa) : ta colocando o conteudo na caixa = autoboxing
classe (caixa) -> primitivo (conteudo da caixa) : ta tirando da caixa = unboxing
*/

public class NumberTest {

    final static int INTEIRO = 1;
    final static double DECIMAL = 1.5;

    @Test
    void testar_metodos_operacoes_numericas() {

        // Upercasting - Conversão automática soma de inteiro com decimal
        double soma = INTEIRO + 0.5;
        assertEquals(DECIMAL, soma);

        // DownCasting não funciona
        // int subtracao = DECIMAL - 0.5;

        // a comparação funciona mas o retorno é um decimal 1.0
        assertEquals(INTEIRO, DECIMAL - 0.5);

    }

}
