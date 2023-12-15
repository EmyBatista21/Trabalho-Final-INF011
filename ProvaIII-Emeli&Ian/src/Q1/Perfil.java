package Q1;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */


import java.util.List;
import java.util.ArrayList;

//Representa a estrutura do Perfil
public class Perfil {
	private String nome;
	private String usuario;
	private String senha;
	private List<CartoesDeCredito> cartoesCredito;
	private List<CPF> cpf;
	private List<Email> emails;
	private List<Rg> rg;

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

}
