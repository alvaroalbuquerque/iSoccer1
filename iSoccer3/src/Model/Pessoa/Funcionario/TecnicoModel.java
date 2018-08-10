package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class TecnicoModel extends FuncionarioModel {
    private int partidasJogadas;

    public TecnicoModel(String nome, String email, String cpf, String telefone, double salario, int partidasJogadas) {
        super(nome, email, cpf, telefone, salario);
        this.partidasJogadas = partidasJogadas;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Numero partidas jogadas: " + this.partidasJogadas);
    }
}
