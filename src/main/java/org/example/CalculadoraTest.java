package org.example;

import org.junit.*;

public class CalculadoraTest {

    @Test
    public void somaDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(1,2);
        Assert.assertEquals(3, soma);
    }

    @Test
    public void subtraiDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int diferenca = calculadora.subtracao(2,1);
        Assert.assertEquals(1, diferenca);
    }
}
