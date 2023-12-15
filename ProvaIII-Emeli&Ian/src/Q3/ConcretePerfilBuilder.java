package Q3;
import java.util.List;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */

// Implementação concreta do Builder
public class ConcretePerfilBuilder implements PerfilBuilder {
    private Perfil perfil;

    public ConcretePerfilBuilder() {
        this.perfil = new Perfil();
    }

    @Override
    public PerfilBuilder setNome(String nome) {
        perfil.setNome(nome);
        return this;
    }

    @Override
    public PerfilBuilder setUsuario(String usuario) {
        perfil.setUsuario(usuario);
        return this;
    }

    @Override
    public PerfilBuilder setSenha(String senha) {
        perfil.setSenha(senha);
        return this;
    }

    @Override
    public PerfilBuilder addCartaoCredito(CartoesDeCredito cartao) {
        perfil.getCartoesCredito().add(cartao);
        return this;
    }

    @Override
    public PerfilBuilder addCPF(CPF cpf) {
        perfil.getCpf().add(cpf);
        return this;
    }

    @Override
    public PerfilBuilder addEmail(Email email) {
        perfil.getEmails().add(email);
        return this;
    }

    @Override
    public PerfilBuilder addRG(Rg rg) {
        perfil.getRg().add(rg);
        return this;
    }

    @Override
    public Perfil build() {
        return perfil;
    }

    @Override
    public String getNome() {
        return perfil.getNome();
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
    public List<CartoesDeCredito> getCartoesCredito() {
        return perfil.getCartoesCredito();
    }

    @Override
    public List<CPF> getCPFs() {
        return perfil.getCpf();
    }

    @Override
    public List<Email> getEmails() {
        return perfil.getEmails();
    }

    @Override
    public List<Rg> getRgs() {
        return perfil.getRg();
    }

	@Override
	public void buildNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildUsuarioSenha(String usuario, String senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildCartaoCredito(CartoesDeCredito cartao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildCPF(CPF cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildEmail(Email email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildRG(Rg rg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Perfil getPerfil() {
		// TODO Auto-generated method stub
		return null;
	}
}
