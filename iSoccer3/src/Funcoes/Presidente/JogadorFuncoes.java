package Funcoes.Presidente;

import Funcoes.DadosFuncoes;
import Funcoes.FuncionarioFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.Funcionario.JogadorModel;
import Print.Menssagem;
import Print.Menus;

public class JogadorFuncoes extends FuncionarioFuncoes {
    public JogadorFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        super(dadosModel, menu, utilidade, mensagem, dadosFuncoes);
    }

    @Override
    public void adicionandoFuncionario() {
        mensagem.mostrarAdicionandoX("Jogador");
        super.adicionandoFuncionario();
        mensagem.mostrarInsira("a posicao do jogador (Ex: Meia, Volante, Goleiro, etc ..)");
        String posicao = utilidade.lerString();
        dadosFuncoes.adicionandoFuncionario(8, new JogadorModel(nome,email,cpf,telefone,salario,posicao));
    }

    private void editandoApto(JogadorModel jogadorModel){

        mensagem.mostrarConcluirProcesso("mudar o estado de " + jogadorModel.getNome(), "1 - CONFIRMAR");
        try {
            int comando = utilidade.lerInteiro();
            if(comando == 1){
                if(jogadorModel.isApto()){
                    boolean feito = false;
                    while(!feito){
                        mensagem.mostrarInsira("motivo da inaptidao de " + jogadorModel.getNome());
                        try{
                            String nMotivo = utilidade.lerString();
                            jogadorModel.setApto(false);
                            jogadorModel.setMotivoApto(nMotivo);
                            feito = true;
                        }catch (NullPointerException e){
                            mensagem.mostrarEntradaInvalida();
                        }
                    }
                }
                else{
                    jogadorModel.setApto(true);
                    jogadorModel.setMotivoApto(null);
                }
                mensagem.mostrarMensagemSucesso();

            }else{
                mensagem.mostrarProcessoCancelado();
            }
        }catch(NumberFormatException e){
            mensagem.mostrarEntradaInvalida();
            mensagem.mostrarProcessoCancelado();
        }
    }
    public void editarApto(){
        if(utilidade.existeArrayFuncionario(dadosModel.getJogadores())) {
            mensagem.mostrarInsira("o e-mail do jogador que gostaria de editar a aptidao");
            String emailJogador = utilidade.lerString();
            int indice = utilidade.indiceFuncionario(emailJogador, dadosModel.getJogadores());
            if (indice != -1) {
                editandoApto(dadosModel.getJogadores().get(indice));
            } else {
                mensagem.mostrarNaoHaXComEsseEmail("jogador");
                mensagem.mostrarProcessoCancelado();
            }
        }else{
            mensagem.mostrarNaoHaX("jogadores");
        }

    }
}
