package Q2;

import java.time.LocalDate;

/* 
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes. 
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível 
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma 
estrutura modular e fácil de manter.
 * */

public class Rg {
    private String numero;

    public Rg(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public boolean validar() {
        // Lógica de validação de RG
        return numero.matches("\\d{10}");
    }
    
    public void add(String rg) {
        // Lógica para adicionar RG
        if (validar()) {
            
        } else {
            System.out.println("RG inválido. Não adicionado ao perfil.");
        }
    }

	public LocalDate getDataFimValidade() {
		LocalDate hoje = LocalDate.now();
	     return hoje.plusYears(10);
	}
}
