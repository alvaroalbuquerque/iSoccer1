package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class AdvogadoModel extends FuncionarioModel {
    private String oab;

    public AdvogadoModel(String nome, String email, String cpf, String telefone, double salario, String oab) {
        super(nome, email, cpf, telefone, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Numero OAB: " + this.oab);
    }
}
