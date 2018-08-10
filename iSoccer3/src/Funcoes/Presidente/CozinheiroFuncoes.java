package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.CozinheiroModel;
import Print.Menssagem;
import Print.Menus;

public class CozinheiroFuncoes extends FuncionarioFuncoes {
    public CozinheiroFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Cozinheiro");
        super.adicionandoFuncionario();
        mensagem.mostrarInsira("a escolaridade (Ex: curso tecnico, graduacao, etc ..)");
        String escolaridade = utilidade.lerString();
        dadosFuncoes.adicionandoFuncionario(6, new CozinheiroModel(nome, email, cpf, telefone, salario, escolaridade));

    }
}
