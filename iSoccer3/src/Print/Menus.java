package Print;

import Rodando.Sistema;

public class Menus {
    private void mostrarCategoriaGeral(){
        System.out.println("1. Funcionarios\n" +
                "2. Socio-Torcedor\n" +
                "3. Recursos Fisicos\n" +
                "0. Sair");
    }

    private void mostrarMenuFuncionarios(){
        System.out.println("1. Adicionar\n" +
                "2. Editar Aptidao Jogador\n" +
                "3. Relatorio\n" +
                "0. Voltar");
    }

    private void mostrarMenuRecursosFisicos(){
        System.out.println("1. Adicionar\n" +
                "2. Checar Disponibilidade\n" +
                "3. Relatorio\n" +
                "0. Voltar");
    }

    private void mostrarMenuSocioTorcedor(){
        System.out.println("1. Adicionar\n" +
                "2. Registrar Pagamento\n" +
                "3. Relatorio\n" +
                "4. Mudar valores associados com os Rankings\n" +
                "5. Restabelecer com Inadimplentes\n" +
                "0. Voltar");
    }

    public void mostrarCategoriaFuncionarios(){
        System.out.println("1. Presidente\n" +
                "2. Medico\n" +
                "3. Tecnico\n" +
                "4. Preparadores Fisicos\n" +
                "5. Motoristas\n" +
                "6. Cozinheiros\n" +
                "7. Advogados\n" +
                "8. Jogadores");
    }
    public void mostrarCategoriaRecursosFisicos(){
        System.out.println("1. Estadio\n" +
                "2. Centro de Treinamento\n" +
                "3. Onibus");

    }
    public boolean mostrarMenuLogin(Sistema sistema){
        boolean feito = false;
        while (!feito) {
            sistema.mensagem.mostrarInsira("login");
            String login = sistema.utilidades.lerString();
            if (login.equals(sistema.dados.getLogin())) {
                sistema.mensagem.mostrarInsira("senha");
                String senha = sistema.utilidades.lerString();
                if (senha.equals(sistema.dados.getSenha())) {
                    sistema.mensagem.mostrarLoginSucesso();
                    return true;
                }else{
                    sistema.mensagem.mostrarXInvalido("senha");
                }
            }else{
                sistema.mensagem.mostrarXInvalido("login");
            }

        }
        sistema.mensagem.mostrarProcessoCancelado();
        return false;

    }

    public void mostrarMenuAddFuncionario(Sistema sistema){
        this.mostrarCategoriaFuncionarios();
        try {
            int comando = sistema.utilidades.lerInteiro();
            switch (comando){
                case 1: sistema.presidenteFuncoes.adicionandoFuncionario();
                    break;
                case 2: sistema.medicoFuncoes.adicionandoFuncionario();
                    break;
                case 3: sistema.tecnicoFuncoes.adicionandoFuncionario();
                    break;
                case 4: sistema.preparadorFisicoFuncoes.adicionandoFuncionario();
                    break;
                case 5: sistema.motoristaFuncoes.adicionandoFuncionario();
                    break;
                case 6: sistema.cozinheiroFuncoes.adicionandoFuncionario();
                    break;
                case 7: sistema.advogadoFuncoes.adicionandoFuncionario();
                    break;
                case 8: sistema.jogadorFuncoes.adicionandoFuncionario();
                    break;
            }
        }catch(NumberFormatException e){
            sistema.mensagem.mostrarEntradaInvalida();
        }
    }

    private void mostrarMenuRelatorioFuncionario(Sistema sistema){
        this.mostrarCategoriaFuncionarios();
        try{
            int comando = sistema.utilidades.lerInteiro();
            if(comando >= 1 && comando <= 8){
                sistema.dadosPrint.relatorioFuncionario(comando);
            }else{
                sistema.mensagem.mostrarEntradaInvalida();
            }

        }catch(NumberFormatException e){
            sistema.mensagem.mostrarEntradaInvalida();
        }
    }

    private void mostrarInteragirMenuFuncionario(Sistema sistema){
        boolean feito = false;
        while(!feito){
            sistema.mensagem.mostrarTituloMenuFULL("MENU FUNCIONARIO");
            this.mostrarMenuFuncionarios();

            try {
                int comando = sistema.utilidades.lerInteiro();
                if (comando == 1) {
                    this.mostrarMenuAddFuncionario(sistema);
                } else if (comando == 2) {
                    sistema.jogadorFuncoes.editarApto();
                } else if (comando == 3) {
                    this.mostrarMenuRelatorioFuncionario(sistema);
                } else if (comando == 0) {
                    feito = true;
                } else {
                    sistema.mensagem.mostrarEntradaInvalida();
                }
            }catch(NumberFormatException e){
                sistema.mensagem.mostrarEntradaInvalida();
            }
        }
    }

    private void mostrarInteragirMenuSocioTorcedor(Sistema sistema){
        boolean feito = false;
        while(!feito){
            sistema.mensagem.mostrarTituloMenuFULL("MENU SOCIO-TORCEDOR");
            this.mostrarMenuSocioTorcedor();
            try{
                int comando = sistema.utilidades.lerInteiro();
                if(comando == 1){
                    sistema.socioTorcedorFuncoes.AdicionandoSocioTorcedor();
                    //add sociotorcedor
                }else if (comando == 2){
                    sistema.socioTorcedorFuncoes.editarAdimplencia();
                    //registrar pagamento
                }else if (comando == 3){
                    sistema.dadosPrint.relatorioSocioTorcedores();
                    //relatorio
                }else if (comando == 4){
                    sistema.socioTorcedorFuncoes.atualizandoRanking(sistema.dados.getSocioTorcedoreModels());
                    //mudar ranking
                }else if (comando == 5){
                    sistema.socioTorcedorFuncoes.retaurarAdimplenciaPadrao();
                    //restabeles inadimplente
                }else if (comando == 0){
                    feito = true;
                }else{
                    sistema.mensagem.mostrarEntradaInvalida();
                }
            }catch (NumberFormatException e){
                sistema.mensagem.mostrarEntradaInvalida();
            }
        }
    }

    private void mostrarMenuAddRecursoFisico(Sistema sistema){
        this.mostrarCategoriaRecursosFisicos();
        try{
            int comando = sistema.utilidades.lerInteiro();
            switch (comando)
            {
                case 1:
                    sistema.estadioFuncoes.adicionandoRecursoFisico();
                    break;
                case 2:
                    sistema.centroTreinamentoFuncoes.adicionandoRecursoFisico();
                    break;
                case 3:
                    sistema.onibusFuncoes.adicionandoRecursoFisico();
                    break;
            }
        }catch (NumberFormatException e){
            sistema.mensagem.mostrarEntradaInvalida();
        }

    }

    public void mostrarInteragirMenuRecursosFisicos(Sistema sistema){
        boolean feito = false;
        while(!feito){
            sistema.mensagem.mostrarTituloMenuFULL("MENU RECURSOS FISICOS");
            this.mostrarMenuRecursosFisicos();
            try{
                int comando = sistema.utilidades.lerInteiro();
                if (comando == 1){
                    this.mostrarMenuAddRecursoFisico(sistema);
                }else if (comando == 2){
                    sistema.dadosPrint.relatorioRecursosFisicos();
                }else if (comando == 3){
                    sistema.dadosPrint.relatorioRecursosFisicos();
                }else if (comando == 0){
                    feito = true;
                }else{
                    sistema.mensagem.mostrarEntradaInvalida();
                }

            }catch (NumberFormatException e){
                sistema.mensagem.mostrarEntradaInvalida();
            }
        }

    }

    public void mostrarMenuISoccer(Sistema sistema){
        boolean feito = false;
        while(!feito){
            sistema.mensagem.mostrarTituloMenuFULL("MENU");
            this.mostrarCategoriaGeral();
            try {
                int comando = sistema.utilidades.lerInteiro();
                if (comando == 1) {
                    this.mostrarInteragirMenuFuncionario(sistema);
                } else if (comando == 2) {
                    this.mostrarInteragirMenuSocioTorcedor(sistema);
                } else if (comando == 3) {
                    this.mostrarInteragirMenuRecursosFisicos(sistema);
                } else if (comando == 0) {
                    feito = true;
                } else {
                    sistema.mensagem.mostrarEntradaInvalida();
                }
            }catch(NumberFormatException e){
                sistema.mensagem.mostrarEntradaInvalida();
            }


        }
        sistema.mensagem.mostrarTituloMenuFULL("MENU");
    }
}
