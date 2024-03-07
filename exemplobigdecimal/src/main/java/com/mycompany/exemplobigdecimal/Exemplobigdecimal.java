/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author aluno
 */
public class Exemplobigdecimal {

    public static void main(String[] args) {
        
        new FramePrincipal().setVisible(true);
        
        BigDecimal valor = new BigDecimal("10.00");
        
        //somar
        BigDecimal valor1 = valor.add(new BigDecimal("2.00"));
        System.out.println("soma: "+ valor1);

        //subtrair
        BigDecimal valor2 = valor.subtract(new BigDecimal("5.00"));
        System.out.println("subtração: "+ valor2);
        
        //dividir
        BigDecimal valor3 = valor.divide(new BigDecimal("2.00"));
        System.out.println("divisão: "+ valor3);
        
        //multiplicação
        BigDecimal valor4 = valor.multiply(new BigDecimal("2.00"));
        System.out.println("multiplicação: "+ valor4);
        
        //comparação
        BigDecimal valor5 = new BigDecimal("20.000");
        int compara = valor5.compareTo(new BigDecimal("20.00"));
        
        // -1 = menor
        if (compara == -1){
            System.out.println(valor5 +" é menor: "+ "20.00");
        
        //  0 = igual
        } else if (compara == 0){
            System.out.println(valor5 +" é igual: "+ "20.00");
            
        //  1 = maior
        } else{
            System.out.println(valor5 +" é maior: "+ "20.00");
        }
        
        // maior entre 2 números
        BigDecimal valor6 = new BigDecimal("5");
        BigDecimal max = valor6.max(new BigDecimal("1"));
        System.out.println("> "+ max);

        // menor entre 2 números
        BigDecimal valor7 = new BigDecimal("1");
        BigDecimal min = valor7.min(new BigDecimal("5"));
        System.out.println("< "+ min);
        
        //potencia
        BigDecimal potencia = valor.pow(2);
        System.out.println("Potencia: "+ potencia);
        
        
        //ARREDONDAMENTO
        
        
        //arredonda pra cima 
        valor = new BigDecimal("111.555500000");
        valor = valor.setScale(3,RoundingMode.CEILING);
        System.out.println("CEILING "+valor);
        
        //arredonda pra 0
        valor = new BigDecimal("111.555500000");
        valor = valor.setScale(3,RoundingMode.DOWN);
        System.out.println("DOWN "+valor);
        
        
        //arredonda pra baixo 
        valor = new BigDecimal("111.555500000");
        valor = valor.setScale(3,RoundingMode.FLOOR);
        System.out.println("FLOOR "+valor);
        
        //arredonda pra cima se maior q 5
        valor = new BigDecimal("111.555500000");
        valor = valor.setScale(3,RoundingMode.HALF_DOWN);
        System.out.println("HALF_DOWN "+valor);
        
        //arredonda pra se menor q 5
        valor = new BigDecimal("111.555500000");
        valor = valor.setScale(3,RoundingMode.UP);
        System.out.println("UP "+valor);
    }
}
