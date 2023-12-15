package Q3;

import java.time.LocalDate;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

//Classe CPF
public class CPF extends Documento {
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

	public boolean validar(String numero) {
		// Lógica de validação de CPF
		return numero.matches("\\d{11}");
	}

	public LocalDate getDataFimValidade() {

		// Assumindo que a validade é de 10 anos a partir de hoje
		LocalDate hoje = LocalDate.now();
		return hoje.plusYears(10);
	}

	@Override
	public void accept(DocumentoVisitor visitor) {
		visitor.visitCPF(this);
	}
}
