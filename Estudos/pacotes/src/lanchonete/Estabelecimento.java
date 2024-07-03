package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		// ações que não precisam estar disponíveis para toda a aplicação;
		/*
		 * cozinheiro.lavarIngredidentes(); cozinheiro.baterVitaminaNoLiquidificador();
		 * cozinheiro.selecionarIngredientesVitamina(); cozinheiro.prepararLanche();
		 * cozinheiro.prepararVitamina();
		 */
		// ações que o estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
//
//		Almoxarife almoxarife = new Almoxarife();
//		// ações que não precisam estar disponíveis para toda a aplicação;
//		almoxarife.controlarEntrada();
//		almoxarife.controlarSaida();

		// ações que somente o seu pacote cozinha precisa conhecer(default);
		// almoxarife.entregarIngredientes();
		// almoxarife.trocarGas();

		Atendente atendente = new Atendente();
//		atendente.pegarLancheCozinha();
		atendente.receberPagamento();

		// ações que somente o seu pacote cozinha precisa conhecer(default);
//		atendente.trocarGas();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

		// não deveria, mas o estabelecimento ainda não estabeleceu normas para o
		// atendimento
//		cliente.pegarPedidoBalcao();

		// esta ação deve ser privada
		cliente.consultarSaldoAplicativo();

		// o cliente não deve ouvir que o gás acabou.
//		cozinheiro.pedirParaTrocarGas(almoxarife);
//		cozinheiro.pedirParaTrocarGas(atendente);

	}

}
