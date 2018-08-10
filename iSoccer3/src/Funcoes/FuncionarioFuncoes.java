package Funcoes;

import Model.DadosModel;
import Model.Pessoa.Funcionario.PresidenteModel;
import Model.Pessoa.FuncionarioModel;
import Print.Menssagem;
import Print.Menus;

public class FuncionarioFuncoes {

    protected DadosModel dadosModel;
    protected Menus menu;
    protected Utilidades utilidade;
    protected Menssagem mensagem;
    protected DadosFuncoes dadosFuncoes;

    protected String nome, email, cpf, telefone;
    protected double salario;

    public FuncionarioFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        this.menu = menu;
        this.utilidade = utilidade;
        this.dadosModel = dadosModel;
        this.mensagem = mensagem;
        this.dadosFuncoes = dadosFuncoes;
    }

    public void adicionandoFuncionario()
    {
        mensagem.mostrarInsira("nome");
        this.nome = utilidade.lerString();
        mensagem.mostrarInsira("email");
        this.email = utilidade.lerString();
        mensagem.mostrarInsira("cpf");
        this.cpf = utilidade.lerString();
        mensagem.mostrarInsira("telefone");
        this.telefone = utilidade.lerString();
        boolean feito = false;
        while(!feito) {
            try {
                mensagem.mostrarInsira("salario");
                this.salario = utilidade.lerDouble();
                feito = true;

            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }
    public void editandoFuncionario(FuncionarioModel funcionarioModel){
        mensagem.mostrarInsiraAtual("novo nome", funcionarioModel.getNome());
        funcionarioModel.setNome(utilidade.lerString());
        mensagem.mostrarInsiraAtual("novo email", funcionarioModel.getEmail());
        funcionarioModel.setEmail(utilidade.lerString());
        mensagem.mostrarInsiraAtual("novo cpf", funcionarioModel.getCpf());
        funcionarioModel.setCpf(utilidade.lerString());
        mensagem.mostrarInsiraAtual("novo telefone", funcionarioModel.getTelefone());
        funcionarioModel.setTelefone(utilidade.lerString());

        boolean feito = false;
        while(!feito) {
            try {
                mensagem.mostrarInsiraAtual("novo salario", Double.toString(funcionarioModel.getSalario()));
                funcionarioModel.setSalario(utilidade.lerDouble());
                feito = true;

            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }

    }
}
