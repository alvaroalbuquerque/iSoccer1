package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.PreparadorFisicoModel;
import Print.Menssagem;
import Print.Menus;

public class PreparadorFisicoFuncoes extends FuncionarioFuncoes {
    public PreparadorFisicoFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Preparador Fisico");
        super.adicionandoFuncionario();
        mensagem.mostrarInsira("a escolaridade (Ex: curso tecnico, graduacao, etc ..)");
        String escolaridade = utilidade.lerString();
        dadosFuncoes.adicionandoFuncionario(4,new PreparadorFisicoModel(nome,email,cpf,telefone,salario,escolaridade));
    }
}
