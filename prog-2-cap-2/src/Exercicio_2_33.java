import java.util.Scanner;

/* Exercício 2-33
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Exercicio_2_33 {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		double peso, altura, IMC;
		
		System.out.print(" Entre com a altura do indivíduo: "); // prompt
		altura = input.nextDouble(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print(" Entre com o peso do indivíduo: "); // prompt
		peso = input.nextDouble(); // lê o primeiro número fornecido pelo usuário
		
		IMC = peso / Math.pow(altura, 2); // multiplicar o peso por 703 se utilizar libras
				
		System.out.printf(" O IMC de um indivíduo de altura %.2f e peso %.2f é %.2f\n", altura, peso, IMC );

		if ( IMC < 18.5 )  
			System.out.print(" Você está abaixo do recomendado. ");
		else if ( IMC <= 24.9 )
			System.out.print(" Você está com o índice do recomendado. ");
		else if ( IMC <= 29.9 )
			System.out.print(" Você está acima do recomendado. ");
		else
			System.out.print(" Você está com o índice de obseidade. ");

		
	} // fim do método main
} // fim da classe