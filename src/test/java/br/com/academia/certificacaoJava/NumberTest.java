package br.com.academia.certificacaoJava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/*
Autoboxing e Unboxing
pensa na classe(Wrappers) como uma caixa q tem um tipo primitivo dentro
primitivo (conteudo da caixa) -> classe (caixa) : ta colocando o conteudo na caixa = autoboxing
classe (caixa) -> primitivo (conteudo da caixa) : ta tirando da caixa = unboxing
*/

public class NumberTest {
    // primitivos
    final static short INTEIRO_SHORT = 1;
    final static byte INTEIRO_BYTE = 4;
    final static int INTEIRO_INT = 8;
    final static long INTEIRO_LONG = 9_999_999L;
    final static float DECIMAL_FLOAT = 2.25F;
    final static double DECIMAL_DOUBLE = 8.5;
    // wrappers
    final static BigDecimal BIG_DECIMAL = new BigDecimal("999999.99");

    @Test
    void testar_metodos_operacoes_numericas() {

        // Upercasting - Conversão automática soma de inteiro com decimal
        double soma = INTEIRO_INT + 0.5;
        assertEquals(8.5, soma);

        // DownCasting não funciona
        // int subtracao = DECIMAL - 0.5;

        // a comparação funciona mas o retorno é um decimal
        assertEquals(8.0, DECIMAL_DOUBLE - 0.5);

    }

}
