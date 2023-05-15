package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Marca marca = new Marca();
		Produto produto = new Produto();
		
		produto.id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do produto: "));
		produto.nome = JOptionPane.showInputDialog("Informe o nome do produto: ");
		produto.descricao = JOptionPane.showInputDialog("Informe a descrição do produto: ");
		produto.preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
		marca.nome = JOptionPane.showInputDialog("Informe o nome da marca do produto: ");
		
		produto.marca = marca;

		JOptionPane.showMessageDialog(null, "id: " + produto.id + "\nNome: " + produto.nome + "\nDescrição: " +
		produto.descricao + "\nPreço: " + produto.preco + "\nMarca: " + produto.marca.nome);
		
	}
}
