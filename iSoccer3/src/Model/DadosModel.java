package Model;

import Model.Pessoa.Funcionario.*;
import Model.Pessoa.FuncionarioModel;
import Model.Pessoa.SocioTorcedorModel;
import Model.RecursosFisicos.CentroTreinamentoModel;
import Model.RecursosFisicos.EstadioModel;
import Model.RecursosFisicos.OnibusModel;

import java.util.ArrayList;

public class DadosModel {
    //login
    private String login = "123";
    private String senha = "123";

    //ST info
    private double topJunior;
    private double topSenior;

    //FuncionariosArray
    private PresidenteModel presidenteModel;
    private TecnicoModel tecnicoModel;
    private MedicoModel medicoModel;
    private ArrayList<JogadorModel> jogadores;
    private ArrayList<MotoristaModel> motoristaModels;
    private ArrayList<PreparadorFisicoModel> preparadoresFisicos;
    private ArrayList<CozinheiroModel> cozinheiroModels;
    private ArrayList<AdvogadoModel> advogadoModels;


    //Socio-Torcedor
    ArrayList<SocioTorcedorModel> socioTorcedoreModels = new ArrayList<>();

    //Recursos Fisicos
    CentroTreinamentoModel centroTreinamentoModel;
    EstadioModel estadioModel;
    ArrayList<OnibusModel> veiculos;

    public DadosModel() {

        this.presidenteModel = new PresidenteModel(null, null, null, null, 0, 0);
        this.tecnicoModel = new TecnicoModel(null, null, null, null, 0, 0);
        this.medicoModel = new MedicoModel(null,null,null,null,0, null);
        this.jogadores = new ArrayList<>();
        this.motoristaModels = new ArrayList<>();
        this.preparadoresFisicos = new ArrayList<>();
        this.cozinheiroModels = new ArrayList<>();
        this.advogadoModels = new ArrayList<>();

        //Socio-Torcedor
        this.socioTorcedoreModels = new ArrayList<>();

        //Recursos Fisicos
        this.centroTreinamentoModel = new CentroTreinamentoModel(null,false, 0);
        this.estadioModel = new EstadioModel(null, false, 0,0,0);
        this.veiculos = new ArrayList<>();

        topJunior = 50;
        topSenior = 200;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public double getTopJunior() {
        return topJunior;
    }

    public void setTopJunior(double topJunior) {
        this.topJunior = topJunior;
    }

    public double getTopSenior() {
        return topSenior;
    }

    public void setTopSenior(double topSenior) {
        this.topSenior = topSenior;
    }

    public PresidenteModel getPresidenteModel() {
        return presidenteModel;
    }

    public void setPresidenteModel(PresidenteModel presidenteModel) {
        this.presidenteModel = presidenteModel;
    }

    public TecnicoModel getTecnicoModel() {
        return tecnicoModel;
    }

    public void setTecnicoModel(TecnicoModel tecnicoModel) {
        this.tecnicoModel = tecnicoModel;
    }

    public MedicoModel getMedicoModel() {
        return medicoModel;
    }

    public void setMedicoModel(MedicoModel medicoModel) {
        this.medicoModel = medicoModel;
    }

    public ArrayList<JogadorModel> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<JogadorModel> jogadores) {
        this.jogadores = jogadores;
    }

    public ArrayList<MotoristaModel> getMotoristaModels() {
        return motoristaModels;
    }

    public void setMotoristaModels(ArrayList<MotoristaModel> motoristaModels) {
        this.motoristaModels = motoristaModels;
    }

    public ArrayList<PreparadorFisicoModel> getPreparadoresFisicos() {
        return preparadoresFisicos;
    }

    public void setPreparadoresFisicos(ArrayList<PreparadorFisicoModel> preparadoresFisicos) {
        this.preparadoresFisicos = preparadoresFisicos;
    }

    public ArrayList<CozinheiroModel> getCozinheiroModels() {
        return cozinheiroModels;
    }

    public void setCozinheiroModels(ArrayList<CozinheiroModel> cozinheiroModels) {
        this.cozinheiroModels = cozinheiroModels;
    }

    public ArrayList<AdvogadoModel> getAdvogadoModels() {
        return advogadoModels;
    }

    public void setAdvogadoModels(ArrayList<AdvogadoModel> advogadoModels) {
        this.advogadoModels = advogadoModels;
    }

    public ArrayList<SocioTorcedorModel> getSocioTorcedoreModels() {
        return socioTorcedoreModels;
    }

    public void setSocioTorcedoreModels(ArrayList<SocioTorcedorModel> socioTorcedoreModels) {
        this.socioTorcedoreModels = socioTorcedoreModels;
    }

    public CentroTreinamentoModel getCentroTreinamentoModel() {
        return centroTreinamentoModel;
    }

    public void setCentroTreinamentoModel(CentroTreinamentoModel centroTreinamentoModel) {
        this.centroTreinamentoModel = centroTreinamentoModel;
    }

    public EstadioModel getEstadioModel() {
        return estadioModel;
    }

    public void setEstadioModel(EstadioModel estadioModel) {
        this.estadioModel = estadioModel;
    }

    public ArrayList<OnibusModel> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<OnibusModel> veiculos) {
        this.veiculos = veiculos;
    }
}
