package Model.Pessoa;

import Model.PessoaModel;

public class FuncionarioModel extends PessoaModel {
    protected double salario;

    public FuncionarioModel(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Salario: R$" + this.salario);
    }
}
