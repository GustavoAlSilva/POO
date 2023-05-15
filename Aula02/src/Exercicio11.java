import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int[][] array = new int[3][3];
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				array[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição " + (i+1) + "," + (j+1)));
				
				sum += array[i][j];	
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Soma de todos os elementos: " + sum);
			
	}

}
