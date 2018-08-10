package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.PresidenteModel;
import Model.Pessoa.FuncionarioModel;
import Print.Menssagem;
import Print.Menus;

public class PresidenteFuncoes extends FuncionarioFuncoes {

    public PresidenteFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Presidente");
        super.adicionandoFuncionario();
        boolean feito = false;
        while(!feito) {
            try {
                mensagem.mostrarInsira("conta bancaria");
                double contaBancaria = utilidade.lerDouble();
                feito = true;
                dadosFuncoes.adicionandoFuncionario(1, new PresidenteModel(nome, email, cpf, telefone, salario, contaBancaria));
            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }
    //falta editar
    public void editandoFuncionario(PresidenteModel funcionarioModel) {
        mensagem.mostrarEditandoX("Presidente");
        if(utilidade.existeSoloFuncionario(dadosModel.getPresidenteModel())) {
            super.editandoFuncionario(funcionarioModel);

            boolean feito = false;
            while (!feito) {
                try {
                    mensagem.mostrarInsiraAtual("nova conta bancaria", "R$" + Double.toString(funcionarioModel.getContaBancaria()));
                    funcionarioModel.setContaBancaria(utilidade.lerDouble());
                    feito = true;
                    mensagem.mostrarMensagemSucesso();
                    //fazer algo com dadosfuncoes
                } catch (NumberFormatException e) {
                    mensagem.mostrarEntradaInvalida();
                }
            }
        }else{
            mensagem.mostrarNaoPodeEditar();
        }
    }
}
