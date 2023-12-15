package Q3;

import java.util.List;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */


public interface PerfilBuilder {
    void buildNome(String nome);
    void buildUsuarioSenha(String usuario, String senha);
    void buildCartaoCredito(CartoesDeCredito cartao);
    void buildCPF(CPF cpf);
    void buildEmail(Email email);
    void buildRG(Rg rg);
    Perfil getPerfil();
    
    PerfilBuilder setNome(String nome);
    PerfilBuilder setUsuario(String usuario);
    PerfilBuilder setSenha(String senha);
    PerfilBuilder addCartaoCredito(CartoesDeCredito cartao);
    PerfilBuilder addCPF(CPF cpf);
    PerfilBuilder addEmail(Email email);
    PerfilBuilder addRG(Rg rg);
    Perfil build();

    String getNome();
    String getUsuario();
    String getSenha();
    List<CartoesDeCredito> getCartoesCredito();
    List<CPF> getCPFs();
    List<Email> getEmails();
    List<Rg> getRgs();
    
}

