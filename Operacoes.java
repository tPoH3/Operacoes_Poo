/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.operacoes;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Operacoes {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static double soma(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public static double subtracao(double valor1, double valor2){
            
        return valor1 - valor2;
        
    }
    
   public static double mutiplicacao(double valor1, double valor2){
            
        return valor1 * valor2;
        
    }
   public static double divisao(double valor1, double valor2){
            
        return valor1 / valor2;
        
    }
   
   public static double max(double[] vetor){
       
       double max = 0;
       
       for(int i = 0; i < vetor.length; i++){
       if(vetor[i] > max){
           max = vetor[i];
       }
           
       }
       return max;
   }
public static double min (double[] vetor){
    
    double min = vetor[0];
    
    for(int i = 0;i < vetor.length; i++){
        if(vetor[i] < min && vetor[i] !=0){
        min = vetor[i];
        }
    }
    return min;
} 

public static double media (double[] vetor){
    double soma  = 0;
    double media = 0;
    
     for(int i = 0; i < 9; i ++){
        soma += vetor[i];
    }
    return media = soma / vetor.length;
    }

public static double mediana (double [] vetor){
            
    }
}