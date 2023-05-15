import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		float quantityKg, copper, zinc;
			
		quantityKg = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade, em Kg, de latão: "));
		
		copper = quantityKg / 100 * 70;
		
		zinc = quantityKg / 100 * 30;
		
		JOptionPane.showMessageDialog(null, "Cobre: " + copper + "Kg" + "\nZinco: " + zinc + "Kg");
		
	}

}
