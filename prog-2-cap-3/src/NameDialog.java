import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Qual o seu nome?");
		
		String message = String.format("Bem-vindo %s a programa��o Java!", name);
		
		JOptionPane.showMessageDialog(null, message);
	}

}
