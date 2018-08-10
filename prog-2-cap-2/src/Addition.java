import java.util.Scanner;

// Figura 2.7: Addition.java
// Programa de adição que exibe a soma de dois números

public class Addition {

	// método principal que inicia a execução do programa Java
	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Entre com o primeiro inteiro: "); // prompt
		number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
		
		System.out.print("Entre com o segundo inteiro: "); // prompt
		number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
		
		sum = number1 + number2;
		
		System.out.printf("A soma é %d\n", sum);		
	} // fim do método main
} // fim da classe Addition