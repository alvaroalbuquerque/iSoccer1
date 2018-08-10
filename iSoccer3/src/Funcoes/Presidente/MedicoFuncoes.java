package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.MedicoModel;
import Print.Menssagem;
import Print.Menus;

public class MedicoFuncoes extends FuncionarioFuncoes {
    public MedicoFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Medico");
        super.adicionandoFuncionario();
        mensagem.mostrarInsira("crm");
        String crm = utilidade.lerString();

        dadosFuncoes.adicionandoFuncionario(2, new MedicoModel(nome, email,cpf,telefone,salario,crm));
    }
}
