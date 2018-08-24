/*
 * Exercício 3.14: EmployeeTest.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */


public class EmployeeTest {

	public static void main(String[] args) {

		Employee empregado1 = new Employee("Rodrigo", "Goulart", 10.0);
		Employee empregado2 = new Employee("Rafael", "Villarreal", 20.0);
		
		System.out.println("Salário do empregado 1: " + empregado1.getSalarioMensal());
		System.out.println("Salário do empregado 2: " + empregado2.getSalarioMensal());
		
		empregado1.setSalarioMensal( empregado1.getSalarioMensal() * 1.1 );
		empregado2.setSalarioMensal( empregado2.getSalarioMensal() * 1.1 );
		
		System.out.println("Salário do empregado 1: " + empregado1.getSalarioMensal());
		System.out.println("Salário do empregado 2: " + empregado2.getSalarioMensal());
		
	}

}
