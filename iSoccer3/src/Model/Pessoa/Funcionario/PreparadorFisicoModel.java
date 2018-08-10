package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class PreparadorFisicoModel extends FuncionarioModel {
    private String escolaridade;

    public PreparadorFisicoModel(String nome, String email, String cpf, String telefone, double salario, String escolaridade) {
        super(nome, email, cpf, telefone, salario);
        this.escolaridade = escolaridade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Escolaridade: " + this.escolaridade);
    }
}
