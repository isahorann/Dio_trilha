package exemploInterface.equipamentos.multifuncional;

import exemploInterface.equipamentos.copiadora.Copiadora;
import exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import exemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via multifuncional");

	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via multifuncional");

	}

	@Override
	public void copiar() {
		System.out.println("Copiando via multifuncional");

	}

}
