package com.example;

import java.util.ArrayList;

public class Calculadora 
{
    private static double num1 = 0;

    private static double num2 = 0;

    private static boolean novoCiclo = true;

    private static double ultimoResultado = 0;

    private  static ArrayList<String> historicoDeOperacoes = new ArrayList<>();

    public static double getNum1()
    {
        return num1;
    }

    public static void setNum1(double num1) {
        Calculadora.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Calculadora.num2 = num2;
    }

    public static boolean isNovoCiclo() {
        return novoCiclo;
    }

    public static void setNovoCiclo(boolean novoCiclo) {
        Calculadora.novoCiclo = novoCiclo;
    }

    public static double getUltimoResultado() {
        return ultimoResultado;
    }

    public static void setUltimoResultado(double novoResultado) {
        ultimoResultado = novoResultado;
    }
    public static void addHistoricoDeOperacoes(String operacaoGerada)
    {
        historicoDeOperacoes.add(operacaoGerada);
    }

    public static ArrayList<String> getHistoricoDeOperacoes() {
        return historicoDeOperacoes;
    }

    public static void setHistoricoDeOperacoes(ArrayList<String> novoHistoricoDeOperacoes) {
        historicoDeOperacoes = novoHistoricoDeOperacoes;
    }
    
    public static void mostrarHistoricoDeOperacoes()
    {
        if(!historicoDeOperacoes.isEmpty())
        {
            System.out.println(" .-.-. HISTÓRICO DE OPERAÇÕES .-.-. ");
            for(String operacao : historicoDeOperacoes)
            {
                System.out.println(operacao);
            }
            System.out.println(" .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");   
        }
    }

    public static void zerarcalculadora()
    {
        setUltimoResultado(0);

        setNovoCiclo(true);

    }

}
