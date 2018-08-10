package Model;

public class PessoaModel {
    protected String nome;
    protected String email;
    protected String cpf;
    protected String telefone;

    public PessoaModel(String nome, String email, String cpf, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void relatorio()
    {
        System.out.println("Nome: " + this.nome + "(CPF: " + this.cpf + ")\n" +
                "E-mail: " + this.email + "\n" +
                "Telefone: " + this.telefone);
    }
}
