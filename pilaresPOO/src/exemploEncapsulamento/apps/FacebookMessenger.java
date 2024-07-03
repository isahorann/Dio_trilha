package exemploEncapsulamento.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo facebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo facebook");
		
	}


}
