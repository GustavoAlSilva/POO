import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {

		int FinalLicensePlate;

		FinalLicensePlate = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final da placa do seu carro: "));

		if(FinalLicensePlate == 0 || FinalLicensePlate == 5) {
		
			JOptionPane.showMessageDialog(null, "Não pode trafegar segunda-feira");
			
		} else if(FinalLicensePlate == 1 || FinalLicensePlate == 6) {
		
			JOptionPane.showMessageDialog(null, "Não pode trafegar terça-feira");

		} else if(FinalLicensePlate == 2 || FinalLicensePlate == 7) {
		
			JOptionPane.showMessageDialog(null, "Não pode trafegar quarta-feira");

		} else if(FinalLicensePlate == 3 || FinalLicensePlate == 8) {
		
			JOptionPane.showMessageDialog(null, "Não pode trafegar quinta-feira");

		} else if(FinalLicensePlate == 4 || FinalLicensePlate == 9) {
		
			JOptionPane.showMessageDialog(null, "Não pode trafegar sexta-feira");

		}
		
	}

}
