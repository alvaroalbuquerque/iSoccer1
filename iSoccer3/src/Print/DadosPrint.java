package Print;

import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.*;
import Model.Pessoa.FuncionarioModel;
import Model.Pessoa.SocioTorcedorModel;
import Model.RecursosFisicos.OnibusModel;

public class DadosPrint {
    DadosModel dadosModel;
    Menssagem mensagem;
    Utilidades utilidades;

    public DadosPrint(DadosModel dadosModel, Menssagem mensagem, Utilidades utilidades) {
        this.mensagem = mensagem;
        this.dadosModel = dadosModel;
        this.utilidades = utilidades;
    }

    public void relatorioFuncionario (int i)
    {
        mensagem.mostrarTituloMenuEsp("RELATORIO");
        switch (i)
        {
            case 1: //presidente
                mensagem.mostrarTituloMenuSemEsp("PRESIDENTE");
                if(utilidades.existeSoloFuncionario(dadosModel.getPresidenteModel())) {
                    dadosModel.getPresidenteModel().relatorio();
                }else{
                    mensagem.mostrarNaoHaX("presidente");
                }
                break;
            case 2: //Medico
                mensagem.mostrarTituloMenuSemEsp("MEDICO");
                if(utilidades.existeSoloFuncionario(dadosModel.getMedicoModel())) {
                    dadosModel.getMedicoModel().relatorio();
                }else{
                    mensagem.mostrarNaoHaX("medico");
                }
                break;
            case 3: //Tecnico
                mensagem.mostrarTituloMenuSemEsp("TECNICO");
                if(utilidades.existeSoloFuncionario(dadosModel.getTecnicoModel())) {
                    dadosModel.getTecnicoModel().relatorio();
                }else{
                    mensagem.mostrarNaoHaX("tecnico");
                }
                mensagem.mostrarTituloMenuFULL("RELATORIO JOGADORES");
                if(utilidades.existeArrayFuncionario(dadosModel.getJogadores())) {
                    for (JogadorModel objeto : dadosModel.getJogadores()) {
                        objeto.relatorio();
                        System.out.println();
                    }
                }else{
                    mensagem.mostrarNaoHaX("jogadores");
                }
                break;
            case 4:
                mensagem.mostrarTituloMenuSemEsp("PREPARADORES FISICOS");
                if(utilidades.existeArrayFuncionario(dadosModel.getPreparadoresFisicos())) {
                    for (PreparadorFisicoModel objeto : dadosModel.getPreparadoresFisicos()) {
                        objeto.relatorio();
                        System.out.println();
                    }
                }else{
                    mensagem.mostrarNaoHaX("preparadores fisicos");
                }
                break;
            case 5:
                mensagem.mostrarTituloMenuSemEsp("MOTORISTA");
                if(utilidades.existeArrayFuncionario(dadosModel.getMotoristaModels())) {
                    for (MotoristaModel objeto : dadosModel.getMotoristaModels()) {
                        objeto.relatorio();
                        System.out.println();
                    }
                }else{
                    mensagem.mostrarNaoHaX("motoristas");
                }
                break;
            case 6:
                mensagem.mostrarTituloMenuSemEsp("COZINHEIRO");
                if(utilidades.existeArrayFuncionario(dadosModel.getCozinheiroModels())) {
                    for (CozinheiroModel objeto : dadosModel.getCozinheiroModels()) {
                        objeto.relatorio();
                        System.out.println();
                    }
                }else{
                    mensagem.mostrarNaoHaX("cozinheiros");
                }
                break;
            case 7:
                mensagem.mostrarTituloMenuSemEsp("ADVOGADO");
                if(utilidades.existeArrayFuncionario(dadosModel.getAdvogadoModels())) {
                    for (AdvogadoModel objeto : dadosModel.getAdvogadoModels()) {
                        objeto.relatorio();
                        System.out.println();
                    }
                }else{
                    mensagem.mostrarNaoHaX("advogados");
                }
                break;

        }
    }
    public void relatorioRecursosFisicos ()
    {
        mensagem.mostrarTituloMenuFULL("RELATORIO ESTADIO");
        if(utilidades.existeSoloRecursos(dadosModel.getEstadioModel())){
            dadosModel.getEstadioModel().relatorio();
        }else{
            mensagem.mostrarNaoHaX("estadio");
        }
        System.out.println();
        mensagem.mostrarTituloMenuFULL("RELATORIO CENTRO DE TREINAMENTO");
        if(utilidades.existeSoloRecursos(dadosModel.getCentroTreinamentoModel())){
            dadosModel.getCentroTreinamentoModel().relatorio();
        }else{
            mensagem.mostrarNaoHaX("centro de treinamento");
        }
        System.out.println();
        mensagem.mostrarTituloMenuFULL("RELATORIO ONIBUS");
        if(utilidades.existeArrayRecursos(dadosModel.getVeiculos())){
            for(OnibusModel objeto : dadosModel.getVeiculos())
            {
                objeto.relatorio();
                System.out.println();
            }
        }else{
            mensagem.mostrarNaoHaX("onibus");
        }
    }
    public void relatorioSocioTorcedores(){
        mensagem.mostrarTituloMenuFULL("RELATORIO SOCIO-TORCEDORES");
        if(utilidades.existeArraySocioTorcedor(dadosModel.getSocioTorcedoreModels())){
            for(SocioTorcedorModel objeto : dadosModel.getSocioTorcedoreModels()){
                objeto.relatorio();
                System.out.println();
            }
        }else{
            mensagem.mostrarNaoHaX("socio-torcedores");
        }
    }


    public void checandoDisponibilidadeRecurso(){
        mensagem.mostrarXDisponivel("estadio", utilidades.existeSoloRecursos(dadosModel.getEstadioModel()));
        mensagem.mostrarXDisponivel("centro de treinamento", utilidades.existeSoloRecursos(dadosModel.getCentroTreinamentoModel()));
        mensagem.mostrarXDisponivel("onibus", utilidades.existeArrayRecursos(dadosModel.getVeiculos()));
    }
}
