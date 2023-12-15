package Q1;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */


//Classe para representar um Email
public class Email {
	private String endereco;

	public Email(String endereco) {
		if (!validar(endereco)) {
	         throw new IllegalArgumentException("Email inválido.");
	     }
	     this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public boolean validar(String endereco) {
		// Lógica de validação de Email
		return endereco.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
	}
	
	public void addEmail(String email) {
	     if (validar(email)) {
	         
	     } else {
	         System.out.println("E-mail inválido. Não adicionado ao perfil.");
	     }
	 }
}
