/*
 * Exercício 3.15: Date.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */


public class Date {
	
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int mes, int dia, int ano) {

		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String displayDate() {
		
		String date = new String(mes + "/" + dia + "/" + ano);
		
		return date;
		
	}

}
