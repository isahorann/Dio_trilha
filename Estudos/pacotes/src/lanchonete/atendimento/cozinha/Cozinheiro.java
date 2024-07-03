package lanchonete.atendimento.cozinha;

import lanchonete.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando natural hamburguer no balcao");
	}

	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcao");
	}

	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}

	private void prepararLanche() {
		System.out.println("Preparando lanche tipo hamburguer");
	}

	private void prepararVitamina() {
		System.out.println("Preparando Vitamina");
	}

	private void lavarIngredidentes() {
		System.out.println("Lavando ingredientes");
	}

	private void selecionarIngredientesVitamina() {
		System.out.println("selecionando ingredientes da vitamina");
	}
	
	private void baterVitaminaNoLiquidificador() {
		System.out.println("batendo vitamina no liquidificador");
	}
	
	private void fritarIngredientesLache() {
		System.out.println("Fritando a carne e o ovo do hambúrguer");
	}
	
	private void pedirParaTrocarGas(Atendente atendente) {
		atendente.trocarGas();
	}

	private void pedirParaTrocarGas(Almoxarife almoxarife) {
		almoxarife.trocarGas();
		
	}


}
