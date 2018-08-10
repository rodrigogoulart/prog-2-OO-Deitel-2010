import java.util.Scanner;

/* Exercício 2-7
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Comparison {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int number1;
		int number2;
		
		System.out.print("Entre com o primeiro inteiro: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print("Entre com o segundo inteiro: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		
		if ( number1 == number2 )
			System.out.printf( " %d == %d \n ", number1, number2 );
	
		if ( number1 != number2 )
			System.out.printf( " %d != %d \n ", number1, number2 );
	
		if ( number1 < number2 )
			System.out.printf( " %d < %d \n ", number1, number2 );
	
		if ( number1 > number2 )
			System.out.printf( " %d > %d \n ", number1, number2 );
	
		if ( number1 <= number2 )
			System.out.printf( " %d <= %d \n ", number1, number2 );
	
		if ( number1 >= number2 )
			System.out.printf( " %d >= %d \n ", number1, number2 );
	
		
		
	} // fim do método main
} // fim da classe Addition