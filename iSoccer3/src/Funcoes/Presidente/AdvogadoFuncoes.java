package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.AdvogadoModel;
import Print.Menssagem;
import Print.Menus;

public class AdvogadoFuncoes extends FuncionarioFuncoes {
    public AdvogadoFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Advogado");
        super.adicionandoFuncionario();
        mensagem.mostrarInsira("n da oab");
        String oab = utilidade.lerString();
        dadosFuncoes.adicionandoFuncionario(7, new AdvogadoModel(nome, email, cpf, telefone,salario,oab));
    }
}
