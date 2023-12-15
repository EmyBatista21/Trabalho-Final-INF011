package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

//Classe para representar um Cartão de Crédito
public class CartoesDeCredito {
 private String numero;

 public CartoesDeCredito(String numero) {
     this.numero = numero;
 }

 public String getNumero() {
     return numero;
 }
}



