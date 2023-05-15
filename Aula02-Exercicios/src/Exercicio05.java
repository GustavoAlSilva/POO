import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		float[] grades = new float[4];
		float gradesSum = 0, gradesAverage;
		
		for(int i = 0; i < 4; i++) {
			
			grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (i+1) + "ª nota: "));
			
			gradesSum += grades[i];
			
		}
		
		gradesAverage = gradesSum / 4;

		if(gradesAverage >= 9) {
		
			JOptionPane.showMessageDialog(null, "Conceito A");
			
		} else if(gradesAverage >= 8 && gradesAverage <= 8.9) {
		
			JOptionPane.showMessageDialog(null, "Conceito B");
			
		} else if(gradesAverage >= 7 && gradesAverage <= 7.9) {
		
			JOptionPane.showMessageDialog(null, "Conceito C");
			
		} else if(gradesAverage <= 6.9) {
		
			JOptionPane.showMessageDialog(null, "Conceito D");
			
		}
		
	}

}
