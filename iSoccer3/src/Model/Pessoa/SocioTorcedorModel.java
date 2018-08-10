package Model.Pessoa;

import Model.DadosModel;
import Model.PessoaModel;

public class SocioTorcedorModel extends PessoaModel {
    protected double valorContribuicao;
    protected boolean adimplente;
    private int tipo; //1 -> junior; 2 -> senior; 3 -> elite;
    DadosModel dadosModel;

    public SocioTorcedorModel(String nome, String email, String cpf, String telefone, double valorContribuicao, DadosModel dadosModel) {
        super(nome, email, cpf, telefone);
        this.valorContribuicao = valorContribuicao;
        this.adimplente = false;
        this.dadosModel = dadosModel;
        this.tipo = tipoPeloValor(valorContribuicao);
    }

    public double getValorContribuicao() {
        return valorContribuicao;
    }

    public void setValorContribuicao(double valorContribuicao) {
        this.valorContribuicao = valorContribuicao;
        this.tipo = tipoPeloValor(valorContribuicao);

    }

    public boolean isAdimplente() {
        return adimplente;
    }

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int tipoPeloValor(double valorContribuicao){

        if(valorContribuicao < dadosModel.getTopJunior())
        {
           return 1; //JUNIOR
        }
        else if(valorContribuicao >= dadosModel.getTopJunior() && valorContribuicao < dadosModel.getTopSenior())
        {
            return 2; //SENIOR
        }
        else
        {
            return 3; //ELITE
        }
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.print("Valor de Contribuicao: " + this.valorContribuicao + "\nStatus: ");
        if(adimplente)
        {
            System.out.println("Adimplente");
        }
        else
        {
            System.out.println("Inadimplente");
        }
        System.out.print("Rank: ");
        switch (this.tipo)
        {
            case 1:
                System.out.println("Junior");
                break;
            case 2:
                System.out.println("Senior");
                break;
            case 3:
                System.out.println("Elite");

        }
    }
}
