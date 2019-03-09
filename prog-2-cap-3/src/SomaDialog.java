import javax.swing.JOptionPane;

public class SomaDialog {

	public static void main(String[] args) {
		
		String num1Str = JOptionPane.showInputDialog("Informe o primeiro numero");
		String num2Str = JOptionPane.showInputDialog("Informe o segundo numero");
		
		Double num1 = new Double(num1Str);
		Double num2 = new Double(num2Str);
		
		double soma = num1.doubleValue() + num2.doubleValue();
		
		String message = String.format("O resultado eh %f ", soma);
		
		JOptionPane.showMessageDialog(null, message);
	}

}
