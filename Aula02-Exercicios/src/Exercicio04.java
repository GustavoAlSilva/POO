import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		float temperatureF, temperatureC;
			
		temperatureF = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: "));
		
		temperatureC = 5 * (temperatureF - 32) / 9;
		
		JOptionPane.showMessageDialog(null, temperatureF + " °F equivalem a " + temperatureC + " °C");
		
	}

}
