package Funcoes;

import Model.DadosModel;
import Model.Pessoa.SocioTorcedorModel;
import Print.Menssagem;
import Print.Menus;

import java.util.ArrayList;

public class SocioTorcedorFuncoes {

    protected DadosModel dadosModel;
    protected Menus menu;
    protected Utilidades utilidade;
    protected Menssagem mensagem;
    protected DadosFuncoes dadosFuncoes;

    double valorContribuicao;

    public SocioTorcedorFuncoes(DadosModel dadosModel, Menus menu, Utilidades utilidade, Menssagem mensagem, DadosFuncoes dadosFuncoes) {
        this.dadosModel = dadosModel;
        this.menu = menu;
        this.utilidade = utilidade;
        this.mensagem = mensagem;
        this.dadosFuncoes = dadosFuncoes;
    }

    public void AdicionandoSocioTorcedor() {
        mensagem.mostrarAdicionandoX("Socio-Torcedor");
        mensagem.mostrarInsira("nome");
        String nome = utilidade.lerString();
        mensagem.mostrarInsira("email");
        String email = utilidade.lerString();
        mensagem.mostrarInsira("cpf");
        String cpf = utilidade.lerString();
        mensagem.mostrarInsira("telefone");
        String telefone = utilidade.lerString();
        boolean feito = false;
        while (!feito) {
            try {
                mensagem.mostrarInsira("valor contribuicao");
                double valorContribuicao = utilidade.lerDouble();
                feito = true;
                dadosFuncoes.adicionandoSocioTorcedor(new SocioTorcedorModel(nome, email, cpf, telefone, valorContribuicao, dadosModel));

            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }

    public void atualizandoRanking(ArrayList<SocioTorcedorModel> arraySocioTorcedor) {
        for (SocioTorcedorModel objeto : arraySocioTorcedor) {
            objeto.setTipo(objeto.tipoPeloValor(objeto.getValorContribuicao()));
        }
    }

    public void editandoTopJuniorSenior() {
        mensagem.mostrarInsira("o novo limite superior para o ranking junior");
        boolean feito = false;
        while (!feito) {
            try {
                dadosModel.setTopJunior(utilidade.lerDouble());
                feito = true;
            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
        feito = false;
        while (!feito) {
            try {
                mensagem.mostrarInsira("o novo limite superior para o ranking senior (Lembre-se que deve ser maior que o limite de junior)");

                double novoTopSenior = utilidade.lerDouble();
                if (utilidade.ehMaior(novoTopSenior, dadosModel.getTopJunior())) {
                    dadosModel.setTopSenior(novoTopSenior);
                    atualizandoRanking(dadosModel.getSocioTorcedoreModels());
                    feito = true;
                } else {
                    mensagem.mostrarEntradaInvalida();
                }
            } catch (NumberFormatException e) {
                mensagem.mostrarEntradaInvalida();
            }
        }
    }

    public void editarAdimplencia()
    {
        mensagem.mostrarInsira("o e-mail do socio-torcedor que ira pagar");
        String emailTorcedor = utilidade.lerString();
        int indice = utilidade.indiceSocioTorcedor(emailTorcedor,dadosModel.getSocioTorcedoreModels());
        if(indice != -1){
            mensagem.mostrarConcluirProcesso("marcar " + dadosModel.getSocioTorcedoreModels().get(indice).getEmail() +
                    " como adimplente", "1 - CONFIRMAR" );
            try {
                int comando = utilidade.lerInteiro();
                if(comando == 1){
                    dadosModel.getSocioTorcedoreModels().get(indice).setAdimplente(true);
                }else{
                    mensagem.mostrarProcessoCancelado();
                }
            }catch(NumberFormatException e){
                mensagem.mostrarEntradaInvalida();
                mensagem.mostrarProcessoCancelado();
            }
        }else{
            mensagem.mostrarNaoHaXComEsseEmail("socio-torcedor");
        }
    }
    private void restaurando(){
        for(SocioTorcedorModel objeto : dadosModel.getSocioTorcedoreModels()){
            objeto.setAdimplente(false);

        }
    }
    public void retaurarAdimplenciaPadrao(){
        mensagem.mostrarTemCerteza("tornar todos socios torcedores como inadimplentes", "1 - CONFIRMAR");
        try {
            int comando = utilidade.lerInteiro();
            if(comando == 1){
                restaurando();
                mensagem.mostrarMensagemSucesso();
            }else {
                mensagem.mostrarProcessoCancelado();
            }
        }catch (NumberFormatException e){
            mensagem.mostrarEntradaInvalida();
            mensagem.mostrarProcessoCancelado();
        }
    }
}
