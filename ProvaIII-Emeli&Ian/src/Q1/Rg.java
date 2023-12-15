package Q1;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */

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
    
    public void add(String rg) {
        if (validar(rg)) {
            
        } else {
            System.out.println("RG inválido. Não adicionado ao perfil.");
        }
    }
}
