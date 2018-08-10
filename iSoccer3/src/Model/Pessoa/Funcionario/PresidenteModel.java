package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class PresidenteModel extends FuncionarioModel {
    private double contaBancaria;

    public PresidenteModel(String nome, String email, String cpf, String telefone, double salario, double contaBancaria) {
        super(nome, email, cpf, telefone, salario);
        this.contaBancaria = contaBancaria;
    }

    public double getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(double contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Conta Bancaria: R$" + this.contaBancaria);
    }
}
