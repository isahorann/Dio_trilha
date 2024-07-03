package herancaPolimorfismo;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep = new Carro();
//		jeep.ligar();
		jeep.setChassi("2321124");

		Moto z400 = new Moto();
		z400.setChassi("34323223");
//		z400.ligar();
		
		//Polimorfismo
		Veiculo coringa = z400;
		coringa.ligar();
	}

}
