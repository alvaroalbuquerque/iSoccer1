package Model;

public class RecursosFisicosModel {
    String nomeGerente;
    boolean disponivel;

    public RecursosFisicosModel(String nomeGerente, boolean disponivel) {
        this.nomeGerente = nomeGerente;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nomeGerente;
    }

    public void setNome(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void relatorio()
    {
        System.out.println("Gerente: " + this.nomeGerente);
    }
}
