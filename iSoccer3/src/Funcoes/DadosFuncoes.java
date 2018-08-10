package Funcoes;

import Model.DadosModel;
import Model.Pessoa.Funcionario.*;
import Model.Pessoa.FuncionarioModel;
import Model.Pessoa.SocioTorcedorModel;
import Model.RecursosFisicos.CentroTreinamentoModel;
import Model.RecursosFisicos.EstadioModel;
import Model.RecursosFisicos.OnibusModel;
import Model.RecursosFisicosModel;
import Print.Menssagem;
import Print.Menus;

public class DadosFuncoes {
    DadosModel dadosModel;
    Utilidades utilidades;
    Menssagem mensagem;
    Menus menus;

    public DadosFuncoes(DadosModel dadosModel, Utilidades utilidades, Menssagem mensagem, Menus menus) {
        this.dadosModel = dadosModel;
        this.utilidades = utilidades;
        this.mensagem = mensagem;
        this.menus = menus;
    }

    public void adicionandoFuncionario(int i, FuncionarioModel novoFuncionario)
    {
        switch (i)
        {
            case 1:
                dadosModel.setPresidenteModel((PresidenteModel)novoFuncionario);
                break;
            case 2:
                dadosModel.setMedicoModel((MedicoModel) novoFuncionario);
                break;
            case 3:
                dadosModel.setTecnicoModel((TecnicoModel) novoFuncionario);
                break;
            case 4: //PF
                dadosModel.getPreparadoresFisicos().add((PreparadorFisicoModel) novoFuncionario);
                break;
            case 5: //Motor
                dadosModel.getMotoristaModels().add((MotoristaModel) novoFuncionario);
                break;
            case 6: //Cozinheiros
                dadosModel.getCozinheiroModels().add((CozinheiroModel) novoFuncionario);
                break;
            case 7: //Advogados
                dadosModel.getAdvogadoModels().add((AdvogadoModel) novoFuncionario);
                break;
            case 8: //Jogadores
                dadosModel.getJogadores().add((JogadorModel) novoFuncionario);
                break;

        }
    }
    public void adicionandoSocioTorcedor(SocioTorcedorModel novoSocioTorcedor)
    {
        dadosModel.getSocioTorcedoreModels().add(novoSocioTorcedor);
    }
    public void adicionandoRecursoFisico(int i, RecursosFisicosModel novoRecurso)
    {
        switch(i)
        {
            case 1: //Onibus
                dadosModel.getVeiculos().add((OnibusModel) novoRecurso);
                break;
            case 2: //Estadio
                dadosModel.setEstadioModel((EstadioModel) novoRecurso);
                break;
            case 3: //CT
                dadosModel.setCentroTreinamentoModel((CentroTreinamentoModel) novoRecurso);
                break;
        }
    }
    //falta editar
    public void editarFuncionario(){
        menus.mostrarCategoriaFuncionarios();
        try {
            int comando = utilidades.lerInteiro();

            switch (comando){
                case 1: //edita presidente
                    if(utilidades.existeSoloFuncionario(dadosModel.getPresidenteModel())){
                        

                    }else {

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }catch(NumberFormatException e){
            mensagem.mostrarEntradaInvalida();
            mensagem.mostrarProcessoCancelado();
        }
    }


}
