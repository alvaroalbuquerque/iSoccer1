package Funcoes;

import Model.Pessoa.FuncionarioModel;
import Model.Pessoa.SocioTorcedorModel;
import Model.RecursosFisicosModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
    Scanner entrada = new Scanner(System.in);

    public double lerDouble() throws NumberFormatException
    {
        double numero = Double.parseDouble(entrada.nextLine());
        return numero;
    }
    public int lerInteiro() throws NumberFormatException
    {
        int numero = Integer.parseInt(entrada.nextLine());
        return numero;
    }
    public String lerString() throws NullPointerException
    {
        return entrada.nextLine();
    }

    public boolean existeSoloFuncionario(FuncionarioModel funcionarioModel){
        if(funcionarioModel.getNome() != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean existeArrayFuncionario(ArrayList<? extends FuncionarioModel> arrayFuncionario){
        if(arrayFuncionario.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean existeSoloRecursos(RecursosFisicosModel recursosFisicosModel){
        if(recursosFisicosModel.getNome() != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean existeArrayRecursos(ArrayList<? extends RecursosFisicosModel> arrayRecursos)    {
        if(arrayRecursos.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean existeArraySocioTorcedor(ArrayList<SocioTorcedorModel> arrayTorcedor){
        if(arrayTorcedor.isEmpty()){
            return false;
        }else
        {
            return true;
        }
    }

    public int indiceSocioTorcedor(String emailTorcedor, ArrayList<SocioTorcedorModel> arrayTorcedor){
        for(SocioTorcedorModel objeto : arrayTorcedor){
            if(objeto.getEmail().equals(emailTorcedor)){
                return arrayTorcedor.indexOf(objeto);
            }
        }
        return -1;
    }

    public int indiceFuncionario(String emailFuncionario, ArrayList<? extends FuncionarioModel> arrayFuncionario){
        for(FuncionarioModel objeto : arrayFuncionario){
            if(objeto.getEmail().equals(emailFuncionario)){
                return arrayFuncionario.indexOf(objeto);
            }
        }
        return -1;
    }

    public boolean ehMaior(double a, double b){
        if(a > b){
            return true;
        }else
        {
            return false;
        }
    }
}
