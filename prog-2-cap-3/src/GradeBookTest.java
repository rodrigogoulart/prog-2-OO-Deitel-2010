import java.util.Scanner;

/*
 * Figura 3.1: GradeBook.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

public class GradeBookTest {

	// método main inicia o programa
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );

		// cria um GradeBook e atribui a meuGradeBook
		GradeBook meuGradeBook = new GradeBook();
		
		// prompt para entrada do nome do curso
		System.out.println("Informe o nome do curso: ");
		String nomeDoCurso = input.nextLine(); // lê uma linha de texto
		System.out.println();
		
		// chama então o método displayMessage do objeto instanciado de GradeBook
		// passa como argumento nomeDoCurso
		meuGradeBook.displayMessage( nomeDoCurso );
		
	} // fim do método main

} // fim da classe GradeBookTest
