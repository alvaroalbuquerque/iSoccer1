package Model.RecursosFisicos;

import Model.RecursosFisicosModel;

public class EstadioModel extends RecursosFisicosModel {
    private int nMaximoTorcedores, nBanheiros, nLanchonetes;

    public EstadioModel(String nomeGerente, boolean disponivel, int nMaximoTorcedores, int nBanheiros, int nLanchonetes) {
        super(nomeGerente, disponivel);
        this.nMaximoTorcedores = nMaximoTorcedores;
        this.nBanheiros = nBanheiros;
        this.nLanchonetes = nLanchonetes;
    }

    public int getnMaximoTorcedores() {
        return nMaximoTorcedores;
    }

    public void setnMaximoTorcedores(int nMaximoTorcedores) {
        this.nMaximoTorcedores = nMaximoTorcedores;
    }

    public int getnBanheiros() {
        return nBanheiros;
    }

    public void setnBanheiros(int nBanheiros) {
        this.nBanheiros = nBanheiros;
    }

    public int getnLanchonetes() {
        return nLanchonetes;
    }

    public void setnLanchonetes(int nLanchonetes) {
        this.nLanchonetes = nLanchonetes;
    }

    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Numero maximo de torcedores: " + this. nMaximoTorcedores + "\n" +
                "Numero de Banheiros: " + this.nBanheiros + "\n" +
                "Numero de Lanchonetes: " + this.nLanchonetes);
    }
}
