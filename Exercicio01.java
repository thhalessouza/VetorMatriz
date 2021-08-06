package lista.de.exercicios.generation;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		double [] pontuacao = new double [5];
		
		double  maior = 0;
		
		{
			
		}
		for(int i = 0; i< pontuacao.length; i++) {
			System.out.println("Informe a pontuação da atividade " +   (i+1) + ":");
			pontuacao[i] = new Scanner (System.in).nextDouble();
			
			}
		
		int i=0;
		if(pontuacao[i] > maior) {
		maior = pontuacao[i];
		
		System.out.println("O maior valor é: " + maior);
		System.out.println("");
	
		
	     
	     
		}
		
		ler.close();
		}
	    
		}
	 
	

