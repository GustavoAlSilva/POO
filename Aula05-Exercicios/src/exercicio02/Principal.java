package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String nome;
		int idade;
		double peso;
		
		nome = JOptionPane.showInputDialog("Informe o nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));

		Pessoa pessoa = new Pessoa(nome, idade, peso);
		
		JOptionPane.showMessageDialog(null, "Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade + "\nPeso: " + pessoa.peso);
		
	}
}
