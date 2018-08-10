package Rodando;

import Funcoes.DadosFuncoes;
import Funcoes.Presidente.*;
import Funcoes.RecursosFisicos.CentroTreinamentoFuncoes;
import Funcoes.RecursosFisicos.EstadioFuncoes;
import Funcoes.RecursosFisicos.OnibusFuncoes;
import Funcoes.SocioTorcedorFuncoes;
import Funcoes.Utilidades;
import Model.DadosModel;
import Model.Pessoa.SocioTorcedorModel;
import Print.DadosPrint;
import Print.Menssagem;
import Print.Menus;

public class Sistema {
    public Menus menus = new Menus();
    public DadosModel dados = new DadosModel();
    public Utilidades utilidades = new Utilidades();
    public Menssagem mensagem = new Menssagem();
    public DadosPrint dadosPrint = new DadosPrint(dados,mensagem,utilidades);
    public DadosFuncoes dadosFuncoes = new DadosFuncoes(dados,utilidades,mensagem,menus);

    public PresidenteFuncoes presidenteFuncoes = new PresidenteFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);
    public MedicoFuncoes medicoFuncoes = new MedicoFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);
    public JogadorFuncoes jogadorFuncoes = new JogadorFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);
    public AdvogadoFuncoes advogadoFuncoes = new AdvogadoFuncoes(dados, menus, utilidades,mensagem,dadosFuncoes);
    public TecnicoFuncoes tecnicoFuncoes = new TecnicoFuncoes(dados, menus, utilidades,mensagem,dadosFuncoes);
    public PreparadorFisicoFuncoes preparadorFisicoFuncoes = new PreparadorFisicoFuncoes(dados, menus, utilidades,mensagem,dadosFuncoes);
    public MotoristaFuncoes motoristaFuncoes = new MotoristaFuncoes(dados, menus, utilidades,mensagem,dadosFuncoes);
    public CozinheiroFuncoes cozinheiroFuncoes = new CozinheiroFuncoes(dados, menus, utilidades,mensagem,dadosFuncoes);

    public SocioTorcedorFuncoes socioTorcedorFuncoes = new SocioTorcedorFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);

    public CentroTreinamentoFuncoes centroTreinamentoFuncoes = new CentroTreinamentoFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);
    public EstadioFuncoes estadioFuncoes = new EstadioFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);
    public OnibusFuncoes onibusFuncoes = new OnibusFuncoes(dados, menus,utilidades,mensagem,dadosFuncoes);
}
