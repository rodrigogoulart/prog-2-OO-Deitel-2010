/*
 * Exercicio 4.1.a: DrawPanel.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_4_1_b extends JPanel{

	// desenha um X a partir dos cantos do painel
	public void paintComponent( Graphics g ) {
		
		// chamaPaintComponent para garantir que o painel seja exibido corretamente
		super.paintComponent( g );
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total

		int i = 0;

		while ( i <= height ) {
			g.drawLine( 0, i, i + 15, height);
			g.drawLine( width, i, width - i, height);
			g.drawLine( 0, height - i, i + 15, 0);
			g.drawLine( width, height - i, width - i, 0);
			i += 15;
		}
				
	} // fim do método paintComponente
	
} // fim da classe DrawPanel
