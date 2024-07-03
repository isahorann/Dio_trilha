package herancaPolimorfismo;

//Herança se representa utilizando extends
public class Carro extends Veiculo{
	

	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("CARRO LIGADO");
	}
	
	private void conferirCombustivel() {
		System.out.println("Conferindo combustível");
	}
	
	private void conferirCambio() {
		System.out.println("Conferindo cambio em P");
	}
}
