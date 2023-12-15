package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */


public interface PerfilProxy {
    NivelPerfil nivel(String usuario, String senha);

    String getUsuario();

    String getSenha();

    NivelPerfil getNivel();
}
