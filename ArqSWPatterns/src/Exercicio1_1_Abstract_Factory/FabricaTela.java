package Exercicio1_1_Abstract_Factory;

/**
 * 
 * @author Giovanna Selihevic Marques 81613657 SI3AN-MCA
 * 			
 *
 */

//Fabrica de impressão na tela
public class FabricaTela implements FabricaAbstrata {
	
	private static final Impressao impressao = new ImpressaoTela();

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
