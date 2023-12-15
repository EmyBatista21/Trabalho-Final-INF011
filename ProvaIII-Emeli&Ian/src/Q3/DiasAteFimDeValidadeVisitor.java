package Q3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* 
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes. 
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível 
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma 
estrutura modular e fácil de manter.
 * */

class DiasAteFimValidadeVisitor implements DocumentoVisitor {
    private LocalDate hoje;

    public DiasAteFimValidadeVisitor(LocalDate hoje) {
        this.hoje = hoje;
    }

    @Override
    public void visitCPF(CPF cpf) {
        //Específica para calcular a quantidade de dias até o fim da validade do CPF
        LocalDate fimValidade = cpf.getDataFimValidade(); 
        long diasAteFimValidade = ChronoUnit.DAYS.between(hoje, fimValidade);
        System.out.println("Dias até o fim da validade do CPF: " + diasAteFimValidade);
    }

    @Override
    public void visitRG(Rg rg) {
        // Lógica específica para calcular a quantidade de dias até o fim da validade do RG
        LocalDate fimValidade = rg.getDataFimValidade(); 
        long diasAteFimValidade = ChronoUnit.DAYS.between(hoje, fimValidade);
        System.out.println("Dias até o fim da validade do RG: " + diasAteFimValidade);
    }
    

	@Override
	public void visitPerfil(Perfil perfil) {
        // Assumindo que Perfil tenha uma data de validade associada
        LocalDate fimValidade = perfil.getDataFimValidade(); 
        long diasAteFimValidade = ChronoUnit.DAYS.between(hoje, fimValidade);
        System.out.println("Dias até o fim da validade do Perfil: " + diasAteFimValidade);
    }

}
