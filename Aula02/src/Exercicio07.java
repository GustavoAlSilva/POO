import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {

		int age;

		age = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

		if(age < 18) {
		
			JOptionPane.showMessageDialog(null, "Não eleitor");
			
		} else if(age >= 18 && age < 65) {
		
			JOptionPane.showMessageDialog(null, "Eleitor obrigatório");

		} else if(age >= 65) {
		
			JOptionPane.showMessageDialog(null, "Eleitor facultativo");
			
		}
		
	}

}
