package Funcoes.RecursosFisicos;

import Funcoes.DadosFuncoes;
import Funcoes.RecursosFisicosFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.RecursosFisicos.OnibusModel;
import Print.Menssagem;
import Print.Menus;

public class OnibusFuncoes extends RecursosFisicosFuncoes {
    public OnibusFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoRecursoFisico() {
        mensagem.mostrarAdicionandoX("Onibus");
        super.adicionandoRecursoFisico();
        mensagem.mostrarInsira("modelo do onibus");
        String nModelo = utilidade.lerString();
        mensagem.mostrarInsira("placa do onibus");
        String nPlaca = utilidade.lerString();
        dadosFuncoes.adicionandoRecursoFisico(1, new OnibusModel(nomeGerente,true,nPlaca, nModelo));

    }
}
