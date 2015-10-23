package com.serrgio.br.algoritmo_3;

/**
 * Serviços oferecidos para 
 * calculos matemáticos.
 */
public class Algoritmo3 {

    /**
     * Obtém a soma de números naturais.
     * 
     * @param n
     * @return s
     */
    public int SomaNaturais(int n) {        
        if(n < 1){
            throw new IllegalArgumentException("o valor de n tem de ser maior ou igual a 1");
        }
        
        int i = 2;
        int s = 1;
        
        while(i <= n){
            s = s + i;
            i = i + 1;
        }
        return s;
    }
    
}