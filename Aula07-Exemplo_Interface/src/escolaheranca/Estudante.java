package escolaheranca;

public abstract class Estudante {
	
	protected String nomeCompleto;
	protected String matricula;
	protected int idade;
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	/*Exemplo de método abstrato pois será implementado de formas diferentes nas classes*/
	public abstract void ajustarMensalidade(double valor);
	
	
	/*Exemplo de sobrecarga de método*/
	public void alterarIdade() {
		this.idade++;
	}
	
	public void alterarIdade(int anos) {
		this.idade=anos;
	}
	
	

}
