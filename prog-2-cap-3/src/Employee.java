/*
 * Exercício 3.14: Employee.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

public class Employee {

	private String primeiroNome;
	private String segundoNome;
	private double salarioMensal;
	
	public Employee(String primeiroNome, String segundoNome, double salarioMensal) {

		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.salarioMensal = salarioMensal;

	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		if ( salarioMensal > 0 )
			this.salarioMensal = salarioMensal;
	}
	
}
