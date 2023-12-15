package Q1;
/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
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
        Email email = new Email("emelisilva159@gmail.com");
        Rg rg = new Rg("2195647795");

        Perfil perfil = director.construirPerfil(builder, "Emeli", "Emy21", "1234", cartao, cpf, email, rg);

        // Exibe as informações do perfil (apenas como exemplo)
        exibirInformacoesDoPerfil(perfil);
    }

    private static void exibirInformacoesDoPerfil(Perfil perfil) {
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Usuário: " + perfil.getUsuario());
        System.out.println("Senha: " + perfil.getSenha());

        System.out.print("Cartões de Crédito:");
        for (CartoesDeCredito cartao : perfil.getCartoesCredito()) {
            System.out.print(" " + cartao.getNumero());
        }
        System.out.println();

        System.out.print("CPF:");
        for (CPF cpf : perfil.getCpf()) {
            System.out.print(" " + cpf.getNumero());
        }
        System.out.println();

        System.out.print("E-mails:");
        for (Email email : perfil.getEmails()) {
            System.out.print(" " + email.getEndereco());
        }
        System.out.println();

        System.out.print("Rg:");
        for (Rg rg : perfil.getRg()) {
            System.out.print(" " + rg.getNumero());
        }
        System.out.println();
    }
}
