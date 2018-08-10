import java.util.Scanner;

/* Exercício 2-15
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 . */

public class Exercicio_2_15 {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int number1;
		int number2;
		
		System.out.print(" Entre com o primeiro inteiro: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print(" Entre com o segundo inteiro: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		
		int soma = number1 + number2;
		int produto = number1 * number2;
		int diferenca = number1 - number2;
		int quociente = number1 / number2;
		
		System.out.printf(" A soma dos número é %d\n", soma);
		System.out.printf(" O produto dos número é %d\n", produto);
		System.out.printf(" A diferença dos número é %d\n", diferenca);
		System.out.printf(" O quociente dos número é %d\n", quociente);
		
	} // fim do método main
} // fim da classe Addition