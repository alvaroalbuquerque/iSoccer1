package Funcoes;

import Rodando.Sistema;

public class SistemaFuncoes {
    Sistema sistema;

    public SistemaFuncoes(Sistema sistema) {
        this.sistema = sistema;
    }

    public void rodarSistema(){
        if(sistema.menus.mostrarMenuLogin(sistema)){
            sistema.menus.mostrarMenuISoccer(sistema);
        }else{
            sistema.mensagem.mostrarEntradaInvalida();
        }
    }
}
