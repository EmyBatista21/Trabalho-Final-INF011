package Q2;
import java.time.LocalDate;

/* 
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes. 
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível 
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma 
estrutura modular e fácil de manter.
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

 private boolean validar(String numero) {
     // Lógica de validação de CPF (implementação básica)
     // Esta implementação é uma simplificação, pode ser necessário melhorar para atender a validação real de CPF
     return numero.matches("\\d{11}");
 }

 public LocalDate getDataFimValidade() {
    
     LocalDate hoje = LocalDate.now();
     return hoje.plusYears(10);

 }

 @Override
 public void accept(DocumentoVisitor visitor) {
     visitor.visitCPF(this);
 }
}
