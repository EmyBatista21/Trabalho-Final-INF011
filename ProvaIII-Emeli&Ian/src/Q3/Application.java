package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

public class Application {
    public static void main(String[] args) {
        // Criar um builder concreto
        PerfilBuilder builder = new ConcretePerfilBuilder();

        // Criar um diretor
        PerfilDirector director = new PerfilDirector();

        // Construir o perfil usando o builder e o diretor
        CartoesDeCredito cartao = new CartoesDeCredito("Cartao1");
        CPF cpf = new CPF("09503058554");
        Email email = new Email("email1@example.com");
        Rg rg = new Rg("2195647795");

        Perfil perfil = director.construirPerfil(builder, "Emeli", "Emy21", "1234", cartao, cpf, email, rg);

        // Criar um Proxy para o ClassificadorPerfil
        ClassificadorPerfilProxy classificadorProxy = new ClassificadorPerfilProxy((Perfil) perfil);

        // Obter o nível de perfil usando o Proxy (é necessário fornecer usuário e senha)
        NivelPerfil nivelAlto = NivelPerfil.criarNivel("ALTO");

        // Exibir as informações do perfil usando o Proxy
        exibirInformacoesDoPerfil(classificadorProxy);
    }

    private static void exibirInformacoesDoPerfil(PerfilProxy perfilProxy) {
    	// Exibir o nível de perfil
        System.out.println("Nível de Perfil: " + perfilProxy.getNivel().toString());
    	
        System.out.println("Usuário: " + perfilProxy.getUsuario());

        // Adicione mais lógica conforme necessário para obter outras informações do perfil usando o Proxy
        // Certifique-se de ajustar os métodos conforme necessário para trabalhar com um objeto PerfilProxy

        // Se o perfil real (Perfil) é necessário, você pode chamar o método getPerfil() no Proxy
        if (perfilProxy instanceof ClassificadorPerfilProxy) {
            Perfil perfilReal = (Perfil) ((ClassificadorPerfilProxy) perfilProxy).getPerfil();

            System.out.println("Senha: " + perfilReal.getSenha());

            System.out.print("Cartões de Crédito:");
            for (CartoesDeCredito cartao : perfilReal.getCartoesCredito()) {
                System.out.println(cartao.getNumero());
            }

            System.out.print("CPF:");
            for (CPF cpf : perfilReal.getCpf()) {
                System.out.println(cpf.getNumero() + ", Data de Fim de Validade: " + cpf.getDataFimValidade());
            }

            System.out.print("Rg:");
            for (Rg rg : perfilReal.getRg()) {
                System.out.println(rg.getNumero() + ", Data de Fim de Validade: " + rg.getDataFimValidade());
            }

            System.out.println("E-mails:");
            for (Email email : perfilReal.getEmails()) {
                System.out.println("- Endereço: " + email.getEndereco());
            }
        }
    }
}
