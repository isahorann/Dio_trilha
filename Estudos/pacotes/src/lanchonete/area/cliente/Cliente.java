package lanchonete.area.cliente;

public class Cliente {

	public void escolherLanche() {
		System.out.println("Escolhendo lanche");
		
	}

	public void fazerPedido() {
		System.out.println("fazendo pedido");
		
	}

	public void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcao");
		
	}

	private void consultarSaldoAplicativo() {
		System.out.println("Consultando no aplicativo");
		
	}

	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("Pagando a conta");
		
	}
	


}
