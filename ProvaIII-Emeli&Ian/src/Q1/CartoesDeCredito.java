package Q1;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */
public class CartoesDeCredito {
 private String numero;

 public CartoesDeCredito(String numero) {
     this.numero = numero;
 }

 public String getNumero() {
     return numero;
 }
}



