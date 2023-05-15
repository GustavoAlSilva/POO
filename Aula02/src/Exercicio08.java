import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		float[] numbers = new float[3];
		
		for(int i = 0; i < 3; i++) {
			
			numbers[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
			
		}

		if(numbers[0] > numbers[1] & numbers[0] > numbers[2]) {
		
			JOptionPane.showMessageDialog(null, "Maior número: " + numbers[0]);
			
		} else if(numbers[1] > numbers[0] & numbers[1] > numbers[2]) {
		
			JOptionPane.showMessageDialog(null, "Maior número: " + numbers[1]);
			
		} else {
		
			JOptionPane.showMessageDialog(null, "Maior número: " + numbers[2]);
		
		}
		
	}

}
