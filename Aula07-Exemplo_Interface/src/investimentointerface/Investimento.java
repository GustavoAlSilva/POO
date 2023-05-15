package investimentointerface;

public interface Investimento {
	
	/*A interface não contém atributos. Pode conter apenas constantes.*/
	
	/*Método abstrato a ser implementado pelas classes que assinam o contrato com a interface. 
	 * A interface possui somente métodos abstrados, por isso a palavra abstract é desnecessária.*/
	
	public double calcularRetorno();

}
