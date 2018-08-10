package Funcoes;

import Model.DadosModel;
import Print.Menssagem;
import Print.Menus;

public class RecursosFisicosFuncoes {

    protected DadosModel dadosModel;
    protected Menus menu;
    protected Utilidades utilidade;
    protected Menssagem mensagem;
    protected DadosFuncoes dadosFuncoes;

    protected String nomeGerente;

    public RecursosFisicosFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        this.dadosModel = dadosModel;
        this.menu = menu;
        this.utilidade = utilidade;
        this.mensagem = mensagem;
        this.dadosFuncoes = dadosFuncoes;
    }

    public void adicionandoRecursoFisico()
    {
        mensagem.mostrarInsira("nome do gerente do recurso");
        this.nomeGerente = utilidade.lerString();
    }

}
