package Model.Pessoa.Funcionario;

import Model.Pessoa.FuncionarioModel;

public class JogadorModel extends FuncionarioModel {
    private boolean apto;
    private String posicaoJogador;
    private String motivoApto;

    public JogadorModel(String nome, String email, String cpf, String telefone, double salario, String posicaoJogador) {
        super(nome, email, cpf, telefone, salario);
        this.posicaoJogador = posicaoJogador;
        this.apto = true;
        this.motivoApto = null;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public String getPosicaoJogador() {
        return posicaoJogador;
    }

    public void setPosicaoJogador(String posicaoJogador) {
        this.posicaoJogador = posicaoJogador;
    }

    public String getMotivoApto() {
        return motivoApto;
    }

    public void setMotivoApto(String motivoApto) {
        this.motivoApto = motivoApto;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.print("Posicao do Jogador: " + this.posicaoJogador + "\nAptidao: ");
        if(this.apto)
        {
            System.out.println("Apto");
        }
        else
        {
            System.out.println("Inapto (Motivo: " + this.motivoApto + ")" );
        }
    }
}
