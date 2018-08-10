package Funcoes.RecursosFisicos;

import Funcoes.DadosFuncoes;
import Funcoes.RecursosFisicosFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.RecursosFisicos.EstadioModel;
import Print.Menssagem;
import Print.Menus;

public class EstadioFuncoes extends RecursosFisicosFuncoes {
    int nTorcedores, nBanheiros, nLanchonetes;
    public EstadioFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoRecursoFisico() {
        mensagem.mostrarAdicionandoX("Estadio");
        super.adicionandoRecursoFisico();
        boolean feito = false;
        while(!feito)
        {
            try
            {
                mensagem.mostrarInsira("numero maximo de torcedores");
                nTorcedores = utilidade.lerInteiro();
                feito = true;
                boolean feito2 = false;
                while(!feito2)
                {
                    try
                    {
                        mensagem.mostrarInsira("numero de banheiros");
                        nBanheiros = utilidade.lerInteiro();
                        feito2 = true;

                        boolean feito3 = false;
                        while(!feito3)
                        {
                            try
                            {
                                mensagem.mostrarInsira("numero de lanchonetes");
                                nLanchonetes = utilidade.lerInteiro();
                                feito3 = true;

                                dadosFuncoes.adicionandoRecursoFisico(2, new EstadioModel(nomeGerente, true, nTorcedores,nBanheiros,nLanchonetes));
                            }
                            catch (NumberFormatException e)
                            {
                                mensagem.mostrarEntradaInvalida();
                            }
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        mensagem.mostrarEntradaInvalida();
                    }
                }
            }
            catch (NumberFormatException e)
            {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }
}
