package Q1;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */

//Classe para representar um CPF
public class CPF {
	private String numero;

	public CPF(String numero) {
		if (!validar(numero)) {
			throw new IllegalArgumentException("CPF inválido.");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	private boolean validar(String numero) {
		return numero.matches("\\d{11}");
	}

	public String add(String cpf) {
		if (validar(cpf))
			return "CPF inválido. Não adicionado ao perfil.";
		return cpf;
	}

}
