package Q3;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

/*
O padrão Proxy foi utilizado para controlar o acesso ao método nivel da classe Perfil. O ClassificadorPerfilProxy atua 
como um intermediário, verificando as credenciais antes de permitir o acesso ao método. Isso adiciona uma camada de segurança, 
garantindo que apenas usuários autorizados, com credenciais corretas, possam executar a operação nivel.
 * */

public class Perfil implements PerfilProxy {
    private String nome;
    private String usuario;
    private String senha;
    private List<CartoesDeCredito> cartoesCredito;
    private List<CPF> cpf;
    private List<Email> emails;
    private List<Rg> rg;
    private List<Documento> documentos = new ArrayList<>();

    public Perfil() {
        this.cartoesCredito = new ArrayList<>();
        this.cpf = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.rg = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<CartoesDeCredito> getCartoesCredito() {
        return cartoesCredito;
    }

    public void setCartoesCredito(List<CartoesDeCredito> cartoesCredito) {
        this.cartoesCredito = cartoesCredito;
    }

    public List<CPF> getCpf() {
        return cpf;
    }

    public void setCpf(List<CPF> cpf) {
        this.cpf = cpf;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Rg> getRg() {
        return rg;
    }

    public void setRg(List<Rg> rg) {
        this.rg = rg;
    }

    public void accept(DocumentoVisitor visitor) {
        // Lógica específica para o perfil, se necessário
        visitor.visitPerfil(this);

        // Chame accept para cada documento no perfil
        for (Documento documento : documentos) {
            documento.accept(visitor);
        }
    }

    public void visit(Perfil perfil) {
        perfil.accept((DocumentoVisitor) this);
    }

    public LocalDate getDataFimValidade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.plusYears(10);
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    @Override
    public NivelPerfil nivel(String usuario, String senha) {
        if (verificarCredenciais(usuario, senha)) {
            return NivelPerfil.ALTO;
        } else {
            return NivelPerfil.DESCONHECIDO;
        }
    }

    private boolean verificarCredenciais(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

	@Override
	public NivelPerfil getNivel() {
	    if (verificarCredenciais(getUsuario(), getSenha())) {
	        return NivelPerfil.ALTO; 
	    } else {
	        return NivelPerfil.DESCONHECIDO;
	    }
	}

}
