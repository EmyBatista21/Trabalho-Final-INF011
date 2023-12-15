package Q2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
O padrão Visitor foi utilizado para adicionar novas operações às classes de documentos sem modificar diretamente essas classes.
Isso possibilita a extensão flexível do comportamento das classes, seguindo o princípio Open/Closed. Com o Visitor, é possível
adicionar funcionalidades sem alterações constantes nas próprias classes, evitando a dispersão de códigos e mantendo uma
estrutura modular e fácil de manter.
*/

// Representa a estrutura do Perfil
public class Perfil {
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

    public void addDocumento(Documento documento) {
        documentos.add(documento);
    }

    public void accept(DocumentoVisitor visitor) {
    	visitor.visitPerfil(this);

        for (Documento documento : documentos) {
            documento.accept(visitor);
        }
    }

    public LocalDate getDataFimValidade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.plusYears(10);
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }
}
