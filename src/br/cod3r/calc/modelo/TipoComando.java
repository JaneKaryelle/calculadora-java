package br.cod3r.calc.modelo;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum TipoComando {

    ZERAR("AC", null),
    SOMA("+", (a, b) -> a + b),
    SUB("-", (a, b) -> a - b),
    MULT("*", (a, b) -> a * b),
    DIV("/", (a, b) -> a / b),
    IGUAL("=", null),
    VIRGULA(",", null),
    NUMERO("", null);

    private final String simbolo;
    private final BiFunction<Double, Double, Double> operacao;

    TipoComando(String simbolo, BiFunction<Double, Double, Double> operacao) {
        this.simbolo = simbolo;
        this.operacao = operacao;
    }

    public double executar (double a, double b) {
        if (operacao == null) return 0;
        return operacao.apply(a, b);
        }

    public static TipoComando encontrarPorSimbolo(String simbolo) {
        return Arrays.stream(values())
                .filter(tipo -> tipo.simbolo.equals(simbolo))
                .findFirst()
                .orElse(null);

    }
}
