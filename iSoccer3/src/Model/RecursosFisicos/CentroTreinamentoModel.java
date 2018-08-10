package Model.RecursosFisicos;

import Model.RecursosFisicosModel;

public class CentroTreinamentoModel extends RecursosFisicosModel {
    private int nDormitorios;

    public CentroTreinamentoModel(String nomeGerente, boolean disponivel, int nDormitorios) {
        super(nomeGerente, disponivel);
        this.nDormitorios = nDormitorios;
    }

    public int getnDormitorios() {
        return nDormitorios;
    }

    public void setnDormitorios(int nDormitorios) {
        this.nDormitorios = nDormitorios;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Numero de dormitorios: " + this.nDormitorios);
    }
}
