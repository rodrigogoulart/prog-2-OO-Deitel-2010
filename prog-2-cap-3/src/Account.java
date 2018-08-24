/*
 * Figura 3.13 + Exercícios 3.12: GradeBook.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */


public class Account {

	private double balance;
	
	public Account (double intialBalance) {
		if ( intialBalance > 0.0 )
			balance = intialBalance;
	}
	
	public void credit( double amount ) {
		balance = balance + amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean debit(double value) {
		
		if ( balance - value > 0.0 ) {
			balance = balance - value;
			return true;
		} else
			return false;	
	}
}
