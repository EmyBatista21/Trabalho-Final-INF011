package Q2;

/* 
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes. 
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível 
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma 
estrutura modular e fácil de manter.
 * */

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
		return endereco.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
	}
	
	public void addEmail(String email) {
	     if (validar(email)) {
	         
	     } else {
	         System.out.println("E-mail inválido. Não adicionado ao perfil.");
	     }
	 }
}
