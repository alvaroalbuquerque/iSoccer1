package Model.RecursosFisicos;

import Model.RecursosFisicosModel;

public class OnibusModel extends RecursosFisicosModel {
    private String placa;
    private String modelo;

    public OnibusModel(String nomeGerente, boolean disponivel, String placa, String modelo) {
        super(nomeGerente, disponivel);
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        modelo = modelo;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Modelo " + this.modelo + " (Placa: " + this.placa + ")");
    }
}
