package pessoas;

public abstract class Pessoa {

	private String nome;
	private int cnpjCpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCnpjCpf() {
		return cnpjCpf;
	}
	
	public void setCnpjCpf(int cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
}
