package Q2;

import java.time.LocalDate;

/* 
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes. 
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível 
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma 
estrutura modular e fácil de manter.
 * */


public class Application {
    public static void main(String[] args) {
        // Cria um builder concreto
        PerfilBuilder builder = new ConcretePerfilBuilder();

        // Cria um diretor
        PerfilDirector director = new PerfilDirector();

        // Constrói o perfil usando o builder e o diretor
        CartoesDeCredito cartao = new CartoesDeCredito("Cartao1");
        CPF cpf = new CPF("09503058554");
        Email email = new Email("email1example.com");
        Rg rg = new Rg("2195647795");

        Perfil perfil = director.construirPerfil(builder, "Emeli", "Emy21", "1234", cartao, cpf, email, rg);

        DiasAteFimValidadeVisitor diasAteFimValidadeVisitor = new DiasAteFimValidadeVisitor(LocalDate.now());

        // Aceita o Visitor para cada documento no perfil
        for (Documento documento : perfil.getDocumentos()) {
            documento.accept(diasAteFimValidadeVisitor);
        }
        // Exibe as informações do perfil (apenas como exemplo)
        exibirInformacoesDoPerfil(perfil);
    }

    private static void exibirInformacoesDoPerfil(Perfil perfil) {
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Usuário: " + perfil.getUsuario());
        System.out.println("Senha: " + perfil.getSenha());

        System.out.print("Cartões de Crédito:");
        for (CartoesDeCredito cartao : perfil.getCartoesCredito()) {
            System.out.println(cartao.getNumero());
        }

        System.out.print("CPF:");
        for (CPF cpf : perfil.getCpf()) {
            System.out.println(cpf.getNumero() + ", Data de Fim de Validade: " + cpf.getDataFimValidade());
        }

        System.out.print("Rg:");
        for (Rg rg : perfil.getRg()) {
            System.out.println(rg.getNumero() + ", Data de Fim de Validade: " + rg.getDataFimValidade());
        }
        
        System.out.print("E-mails:");
        for (Email email : perfil.getEmails()) {
            System.out.println(email.getEndereco());
        }
    }

}
