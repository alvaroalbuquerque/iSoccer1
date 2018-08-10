package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class MedicoModel extends FuncionarioModel {
    private String crm;

    public MedicoModel(String nome, String email, String cpf, String telefone, double salario, String crm) {
        super(nome, email, cpf, telefone, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("CRM: " + this.crm);
    }
}
