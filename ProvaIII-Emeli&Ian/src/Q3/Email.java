package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

//Classe para representar um Email
public class Email {
	private String endereco;

	public Email(String endereco) {
		if (!validar(endereco)) {
			throw new IllegalArgumentException("CPF inválido.");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public boolean validar(String endereco) {
		return endereco.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
	}
	
}
