package com.serrgio.br.algoritmo_3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de teste da classe Algoritmo3
 */
public class Algoritmo3Test {
    
    /**
     * Teste envio de argumento válido para o  método SomaNaturais, da classe Algoritmo3.
     */
    @Test
    public void testSomaNaturais() {
        int n = 2;
        Algoritmo3 instance = new Algoritmo3();
        
        int expResult = 3;
        int result = instance.SomaNaturais(n);
        
        assertEquals(expResult, result);
    } 
    
    /**
    * Teste envio de argumento inválido para o método SomaNaturais, da classe Algoritmo3.
    */
    @Test(expected=IllegalArgumentException.class)
    public void testArgumentoInvalido() {
       Algoritmo3 instance = new Algoritmo3();
       instance.SomaNaturais(0);
    }
   
}