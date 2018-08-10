package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.TecnicoModel;
import Model.Pessoa.FuncionarioModel;
import Print.Menssagem;
import Print.Menus;

public class TecnicoFuncoes extends FuncionarioFuncoes {
    public TecnicoFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Tecnico");
        super.adicionandoFuncionario();
        boolean feito = false;
        while(!feito) {
            try {
                mensagem.mostrarInsira("quantas partidas ele(a) atuou como tecnico");
                int partidasJogadas = utilidade.lerInteiro();
                feito = true;
                dadosFuncoes.adicionandoFuncionario(3, new TecnicoModel(nome, email, cpf, telefone, salario, partidasJogadas));
            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }
}
