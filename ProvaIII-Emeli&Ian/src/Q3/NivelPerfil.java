package Q3;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

public class NivelPerfil {

    public static final NivelPerfil DESCONHECIDO = new NivelPerfil("BAIXO");

    public static final NivelPerfil ALTO = new NivelPerfil("ALTO");

    private final String nivel;

    private NivelPerfil(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return nivel;
    }

    public static NivelPerfil criarNivel(String string) {
        return new NivelPerfil(string); 
    }
}
