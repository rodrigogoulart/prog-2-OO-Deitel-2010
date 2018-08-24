/*
 * Figura 3.14: GradeBook.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

import java.util.Scanner;

public class AccountTest {

	public static void main( String[] args) {
		
		// Cria duas instâncias de Account e inicializa saldos
		Account account1 = new Account( 50.00 );
		Account account2 = new Account( -7.53 );
		
		// Imprime Saldos
		System.out.printf("account balance 1 = %f\n", account1.getBalance());
		System.out.printf("account balance 2 = %f\n\n", account2.getBalance());
		
		Scanner input = new Scanner( System.in );
		double depositAmount; 
		
		System.out.println("Enter deposit amount for account 1: ");
		depositAmount = input.nextDouble();
		
		// Faz um depósico da conta 1
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
		account1.credit(depositAmount);

		System.out.printf("account balance 1 = %f\n", account1.getBalance());
		System.out.printf("account balance 2 = %f\n\n", account2.getBalance());

		System.out.println("Enter deposit amount for account 2: ");
		depositAmount = input.nextDouble();
		
		// Faz um depósito da conta 2
		System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
		account2.credit(depositAmount);

		System.out.printf("account balance 1 = %f\n", account1.getBalance());
		System.out.printf("account balance 2 = %f\n\n", account2.getBalance());
		
		
		/* 
		 * Trecho em resposta ao exercício 3.12
		 */
		double debitAmount;
		
		System.out.println("Enter debit amount for account 1: ");
		debitAmount = input.nextDouble();
		
		// Faz um débito da conta 1
		System.out.printf("\nsubtract %.2f from account1 balance\n\n", debitAmount);
		if ( !account1.debit(debitAmount) )
			System.out.println("Debit amount exceeded account balance");

		System.out.printf("account balance 1 = %f\n", account1.getBalance());
		
		/* 
		 * Fim do trecho em resposta ao exercício 3.12
		 */

		input.close();
		
	}
	
}
