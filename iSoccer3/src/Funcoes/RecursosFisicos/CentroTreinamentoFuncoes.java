package Funcoes.RecursosFisicos;

import Funcoes.DadosFuncoes;
import Funcoes.RecursosFisicosFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.RecursosFisicos.CentroTreinamentoModel;
import Print.Menssagem;
import Print.Menus;

public class CentroTreinamentoFuncoes extends RecursosFisicosFuncoes {
    public CentroTreinamentoFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoRecursoFisico() {
        mensagem.mostrarAdicionandoX("centro de treinamento");
        super.adicionandoRecursoFisico();
        boolean feito = false;
        while(!feito) {
            try {
                mensagem.mostrarInsira("numero de dormitorios");
                int nDormitorio = utilidade.lerInteiro();
                feito = true;
                dadosFuncoes.adicionandoRecursoFisico(3, new CentroTreinamentoModel(nomeGerente, true, nDormitorio));
            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }
}
