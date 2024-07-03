package exemploInterface.equipamentos.estabelecimento;

import exemploInterface.equipamentos.multifuncional.EquipamentoMultifuncional;
import exemploInterface.equipamentos.impressora.Impressora;
import exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import exemploInterface.equipamentos.copiadora.Copiadora;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;

		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
