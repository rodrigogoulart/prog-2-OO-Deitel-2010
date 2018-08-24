/*
 * Exercício 3.13: Invoice.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

public class Invoice {

	private String numero;
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice() {

		this.numero = new String();
		this.descricao = new String();
		this.quantidade = 0;
		this.preco = 0.0;
	}
	
	public double getInvoiceAmount() {
		
		if ( quantidade > 0 & preco > 0 )
			return preco * quantidade;
		else
			return 0.0;
	}
	
}
