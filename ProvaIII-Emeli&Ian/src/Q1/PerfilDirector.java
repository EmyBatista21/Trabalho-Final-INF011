package Q1;

/*
O padrão Builder foi o escolhido para simplificar a criação de objetos complexos, como o Perfil, que têm partes obrigatórias 
e opcionais. Ele oferece flexibilidade na configuração do perfil, evitando a complexidade de um construtor com muitos parâmetros. 
Essa escolha torna a construção do perfil mais simples, modular e fácil de entender.
* */


// Diretor para construir o perfil usando o Builder
public class PerfilDirector {
    public Perfil construirPerfil(PerfilBuilder builder, String nome, String usuario, String senha,
                                  CartoesDeCredito cartao, CPF cpf, Email email, Rg rg) {
        return builder.setNome(nome)
                      .setUsuario(usuario)
                      .setSenha(senha)
                      .addCartaoCredito(cartao)
                      .addCPF(cpf)
                      .addEmail(email)
                      .addRG(rg)
                      .build();
    }
}
