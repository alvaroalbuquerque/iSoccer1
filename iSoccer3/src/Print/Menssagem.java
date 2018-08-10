package Print;

public class Menssagem {

    public void mostrarMensagemErro()
    {
        System.out.println("Ocorreu um erro nessa operacao.");
    }

    public void mostrarEntradaInvalida()
    {
        System.out.println("Entrada Invalida.");
    }

    public void mostrarMensagemSucesso()
    {
        System.out.println("Operacao finalizada com sucesso!");
    }

    public void mostrarInsira(String string)
    {
        System.out.print("Insira " + string + ":\t");
    }
    public void mostrarInsiraAtual(String info, String atual){
        System.out.print("Insira " + info + " (Atual: " + atual + "):\t");
    }
    public void mostrarNaoPodeEditar(){
        System.out.println("Edicao indisponivel.");
    }
    public void mostrarLoginSucesso(){
        System.out.println("Logado com sucesso");
    }
    public void mostrarXInvalido(String string){
        System.out.println(string + " invalido.");
    }

    public void mostrarXDisponivel(String recurso, boolean disponivel){
        System.out.println("Disponibilidade de " + recurso + ":");
        if(disponivel){
            System.out.println("Ha " + recurso + " disponivel.");
        }else{
            System.out.println("Nao ha " + recurso + " disponivel.");
        }
    }
    public void mostrarAdicionandoX(String string)
    {
        System.out.println("Adicionando " + string + ":");
    }
    public void mostrarEditandoX(String string)
    {
        System.out.println("Editando " + string + ":");
    }

    public void mostrarNaoHaX(String string)
    {
        System.out.println("Nao ha " + string + " cadastrado(s).");
    }
    public void mostrarNaoHaXComEsseEmail(String string){
        System.out.println("Nao ha " + string + " cadastrado com esse e-mail.");
    }

    public void mostrarTituloMenuEsp(String string){
        System.out.print("            " + string);
    }

    public void mostrarTituloMenuSemEsp(String string){
        System.out.println(" " + string);
    }
    public void mostrarTituloMenuFULL(String string)
    {
        System.out.println("            " + string);
    }

    public void mostrarConcluirProcesso(String processo, String comando){
        System.out.println("Gostaria de " + processo + "?");
        System.out.println(comando);
    }

    public void mostrarProcessoCancelado(){
        System.out.println("Processo cancelado.");
    }

    public void mostrarTemCerteza(String processo, String comando){
        System.out.println("Tem certeza que deseja " + processo + "?");
        System.out.println(comando);
    }
}
