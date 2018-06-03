package Exercicio1_1_Abstract_Factory;
/**
 * 
 * @author Giovanna Selihevic Marques 81613657 SI3AN-MCA
 * 			
 *
 */

//Fabrica de impressão no arquivo Abstrato
public class FabricaArquivo implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
