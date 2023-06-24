/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.operacoes;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String args[]){   
       
        Operacoes biblioteca = new Operacoes();
        double vetor[] = new double[10];
        
        vetor[0] = 100;
        vetor[1] = 1;
        vetor[2] = 128;
        vetor[3] = 900;
        vetor[4] = 13;
        vetor[5] = 780;
        vetor[6] = 100;
        vetor[7] = 11;
        vetor[8] = 45;
        vetor[9] = 487;
        
        
        double  soma          = biblioteca.soma(1,1);
        double  subtracao     = biblioteca.subtracao(100,50);
        double  mutiplicacao = biblioteca.mutiplicacao(3,3);
        double  divisao       = biblioteca.divisao(10,5);
         
        double max   = biblioteca.max(vetor);
        double min   = biblioteca.min(vetor);
        double media = biblioteca.media(vetor);
        
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(mutiplicacao);
        System.out.println(divisao);
        System.out.println(max);
        System.out.println(min);
        System.out.println(media);
    	System.exit(0);
		
    }
		
}
