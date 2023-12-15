package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

// Implementação do Proxy
public class ClassificadorPerfilProxy implements PerfilProxy {
    private Perfil perfil;

    public ClassificadorPerfilProxy(Perfil perfil) {
        this.perfil = perfil;
    }

    public NivelPerfil nivel() {
        return perfil.nivel(null, null);
    }

    public NivelPerfil nivel(String usuario, String senha) {
        // Verifica as credenciais antes de permitir o acesso ao ClassificadorPerfil
        if (verificarCredenciais(usuario, senha)) {
            return nivel();  // Chama o método nivel() na instância real
        } else {
            return NivelPerfil.DESCONHECIDO;
        }
    }

    private boolean verificarCredenciais(String usuario, String senha) {
        return usuario.equals(perfil.getUsuario()) && senha.equals(perfil.getSenha());
    }

    @Override
    public String getUsuario() {
        return perfil.getUsuario();
    }

    @Override
    public String getSenha() {
        return perfil.getSenha();
    }

    @Override
    public NivelPerfil getNivel() {
        // Chama diretamente o método getNivel no objeto perfil
        return perfil.getNivel();
    }

    // Método para obter a instância real do perfil
    public Perfil getPerfil() {
        return perfil;
    }
}
