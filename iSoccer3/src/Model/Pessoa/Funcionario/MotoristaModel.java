package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class MotoristaModel extends FuncionarioModel {
    private String cnh;

    public MotoristaModel(String nome, String email, String cpf, String telefone, double salario, String cnh) {
        super(nome, email, cpf, telefone, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("CNH: " + this.cnh);
    }
}
