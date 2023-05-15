package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			
		Marca marca = new Marca();
		Produto produto = new Produto();
		
		produto.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do produto: ")));
		produto.setNome(JOptionPane.showInputDialog("Informe o nome do produto: "));
		produto.setDescricao(JOptionPane.showInputDialog("Informe a descrição do produto: "));
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: ")));
		marca.setNome(JOptionPane.showInputDialog("Informe o nome da marca do produto: "));
		
		produto.setMarca(marca);
		
		JOptionPane.showMessageDialog(null, "Id: " + produto.getId() + "\nNome: " + produto.getNome() +
		"\nDescrição: " + produto.getDescricao() + "\nPreço: " + produto.getPreco() + "\nMarca: " +
		produto.getMarca().getNome());
	}
}
