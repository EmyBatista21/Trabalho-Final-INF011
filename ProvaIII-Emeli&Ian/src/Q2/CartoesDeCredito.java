package Q2;

/* 
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes. 
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível 
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma 
estrutura modular e fácil de manter.
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



