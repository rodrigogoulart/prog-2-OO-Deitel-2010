import java.util.Scanner;

/* Exercício 2-30
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Exercicio_2_30 {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int numero;
		int resto;
		
		System.out.print(" Entre com o numero de 5 dígitos: "); // prompt
		numero = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		int digito1 = numero / 10000;
		resto = numero % 10000;
		int digito2 = resto / 1000;
		resto = resto % 1000;
		int digito3 = resto / 100;
		resto = resto % 100;
		int digito4 = resto / 10;
		resto = resto % 10;
		int digito5 = resto;
		
		System.out.printf(" %d   %d   %d   %d   %d\n", digito1, digito2, digito3, digito4, digito5 );
		
	} // fim do método main
} // fim da classe Addition