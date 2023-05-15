import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		int even = 0, odd = 0, evenSum = 0, oddSum = 0;
		
		for(int i = 0; i < 10; i++) {
			
			numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor: "));
			
			if(numbers[i] % 2 == 0) {
				
				evenSum += numbers[i];
				
				even++;
				
			} else {
				
				oddSum += numbers[i];
				
				odd++;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Quantidade de pares: " + even + "\nSoma dos pares: " + evenSum + "\n\nQuantidade de ímpares: " + odd + "\nSoma dos ímpares: " + oddSum);
		
	}

}
