import java.util.Scanner;

/* Exercício 2-28
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Exercicio_2_28 {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int raio;
		
		System.out.print(" Entre com o raio do círculo: "); // prompt
		raio = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.printf(" O diâmetro do círuclo de raio %d é %d\n", raio, ( 2 * raio ) );
		System.out.printf(" A circunferência do círuclo de raio %d é %f\n", raio, ( 2 * Math.PI * raio ) );
		System.out.printf(" A área do círuclo de raio %d é %f\n", raio, ( Math.PI * Math.pow(raio, 2) ) );
		
	} // fim do método main
} // fim da classe Addition