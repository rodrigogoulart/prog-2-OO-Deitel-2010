import java.util.Scanner;

/* Exercício 2-25
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Exercicio_2_25 {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int number1;
		
		System.out.print(" Entre com o primeiro inteiro: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		int resto = number1 % 2;
		
		if ( resto == 0 ) 
			System.out.printf(" O número %d é par!\n", number1);
		else
			System.out.printf(" O número %d é ímpar!\n", number1);
		
	} // fim do método main
} // fim da classe Addition