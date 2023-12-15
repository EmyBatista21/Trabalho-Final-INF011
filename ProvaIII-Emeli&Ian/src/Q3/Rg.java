package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

import java.time.LocalDate;

public class Rg {
    private String numero;

    public Rg(String numero) {
    	if (!validar(numero)) {
			throw new IllegalArgumentException("RG inválido.");
		}
		this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public boolean validar(String numero) {
        return numero.matches("\\d{10}");
    }
    
	public LocalDate getDataFimValidade() {
		LocalDate hoje = LocalDate.now();
	     return hoje.plusYears(10);
	}
}
