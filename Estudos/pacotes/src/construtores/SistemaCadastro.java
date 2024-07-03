package construtores;

public class SistemaCadastro {

	public static void main(String[] args) {
// criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("12345443", "marcos");
		// definimos o endereço
		marcos.setEndereco("Rua das gaivotas");
		
		System.out.println("A pessoa se chama "+ marcos.getNome() + " tem o cpf " + marcos.getCpf() + " e mora no endereço " + marcos.getEndereco());
	}

}
