package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Giovanna Selihevic Marques 81613657 SI3AN-MCA
 * 			
 *
 */

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Giovanna";
		String sobrenome = "Marques";
		
		fn.getNome(nome, sobrenome);

	}

}