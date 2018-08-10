import java.util.Scanner;

/* Exercício 2-32
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Exercicio_2_32 {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int numero1, numero2, numero3, numero4, numero5;
		int negativos,positivos,zeros;
		
		positivos = negativos = zeros = 0;
		
		System.out.print(" Entre com o numero: "); // prompt
		numero1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print(" Entre com o numero: "); // prompt
		numero2 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print(" Entre com o numero: "); // prompt
		numero3 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print(" Entre com o numero: "); // prompt
		numero4 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print(" Entre com o numero: "); // prompt
		numero5 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

		if ( numero1 == 0 )
			zeros++;
		else if ( numero1 < 0 ) 
			negativos++;
		else
			positivos++;
		
		if ( numero2 == 0 )
			zeros++;
		else if ( numero2 < 0 ) 
			negativos++;
		else
			positivos++;
		
		if ( numero3 == 0 )
			zeros++;
		else if ( numero3 < 0 ) 
			negativos++;
		else
			positivos++;
		
		if ( numero4 == 0 )
			zeros++;
		else if ( numero4 < 0 ) 
			negativos++;
		else
			positivos++;
		
		if ( numero5 == 0 )
			zeros++;
		else if ( numero5 < 0 ) 
			negativos++;
		else
			positivos++;
		
		System.out.printf(" Temos %d positivo(s), %d negativo(s) e %d zero(s)\n", positivos, negativos, zeros );
		
	} // fim do método main
} // fim da classe Addition