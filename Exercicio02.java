package lista.de.exercicios.generation;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double [] lancamento = new double [10];
		
		double soma = 0.0, maior = 0.0, mediaLancamento = 0.0;
		
		int i;
		double maiorPontuacao = 0 ; 
		
		
			
		for( i = 0; i <=9; i++);
		
			System.out.println("Entre com o lan�amento ");
			lancamento[i] = ler.nextDouble();
			
			soma = soma + lancamento [i];
			mediaLancamento = soma / 10;
					
		if(lancamento[i] == maior) {
			maiorPontuacao++;
		
		} if(maior < lancamento [(int) i]) {
			maior = lancamento[i];
		
		}
		
	
		System.out.println("O total do lan�amento �: " + soma);
		System.out.println("\nA m�dia dos lan�amentos �: " + mediaLancamento);
		System.out.println("\nO valor da maior pontua��o �: " + (maiorPontuacao+1) + "e o maior lan�amento foi: " + maior);
		
		
		}
	    
	    
	}


