package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.MotoristaModel;
import Model.Pessoa.FuncionarioModel;
import Print.Menssagem;
import Print.Menus;

import java.util.ArrayList;

public class MotoristaFuncoes extends FuncionarioFuncoes {
    public MotoristaFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Motorista");
        super.adicionandoFuncionario();
        mensagem.mostrarInsira("o numero da cnh");
        String cnh = utilidade.lerString();
        dadosFuncoes.adicionandoFuncionario(5,new MotoristaModel(nome,email,cpf,telefone,salario,cnh));
    }


    public void editandoFuncionario(ArrayList<MotoristaModel> arrayFuncionarioModel) {
        mensagem.mostrarEditandoX("Motorista");
        if(utilidade.existeArrayFuncionario(arrayFuncionarioModel)) {
            mensagem.mostrarInsira("e-mail da pessoa que gostaria de editar");
            String nEmail = utilidade.lerString();
            int indice = utilidade.indiceFuncionario(nEmail, arrayFuncionarioModel);
            if(indice != -1) {
                super.editandoFuncionario(dadosModel.getMotoristaModels().get(indice));
                mensagem.mostrarInsiraAtual("nova cnh", dadosModel.getMotoristaModels().get(indice).getCnh());
                dadosModel.getMotoristaModels().get(indice).setCnh(utilidade.lerString());
                mensagem.mostrarMensagemSucesso();
            }else{
                mensagem.mostrarNaoHaXComEsseEmail("motorista");
            }
        }else{
            mensagem.mostrarNaoPodeEditar();
        }
    }
}
