package Exercicio2_2_FactoryMethod;
/**
 * 
 * @author Giovanna Selihevic Marques 81613657 SI3AN-MCA
 * 			
 *
 */

public class ProvedorInformacao extends Texto{
	
	public ProvedorInformacao(){
		
	}
	public ProvedorInformacao(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
