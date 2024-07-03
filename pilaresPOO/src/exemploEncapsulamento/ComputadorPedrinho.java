package exemploEncapsulamento;

import exemploEncapsulamento.apps.FacebookMessenger;
import exemploEncapsulamento.apps.MSNMessenger;
import exemploEncapsulamento.apps.ServicoMensagemInstantanea;
import exemploEncapsulamento.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		/*
		 * System.out.println("MSN"); MSNMessenger msn = new MSNMessenger();
		 * msn.enviarMensagem(); msn.receberMensagem();
		 * 
		 * System.out.println("FACEBOOK"); FacebookMessenger fcb = new
		 * FacebookMessenger(); fcb.enviarMensagem(); fcb.receberMensagem();
		 * 
		 * System.out.println("TELEGRAM"); Telegram tlg = new Telegram();
		 * tlg.enviarMensagem(); tlg.receberMensagem();
		 */

		// resolução com polimorfismo
		String appEscolhido = "msn";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();
	}

}
