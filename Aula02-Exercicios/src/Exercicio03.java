import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		int x;
		
		for(int i = 0; i < 10; i++) {
			
			numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor: "));
			
		}
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser procurado: "));
		
		for(int i = 0; i < 10; i++) {
			
			if(numbers[i] == x) {
				
				JOptionPane.showMessageDialog(null, "Posição do valor " + x + ": " + i);
				
				return;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Valor " + x + " não encontrado");
		
	}

}
