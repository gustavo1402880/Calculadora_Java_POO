package com.example.funcoes.equacoesTrigonometricas;

import com.Utillity;
import com.example.Calculadora;

public class SenoCossenoTangente extends Calculadora 
{
    public static void inserirDadosGraus()
    {
        System.out.print("Ângulo (em graus): ");
        setNum1(Math.toRadians(Utillity.rdDouble()));

        if(getNum1() < 0 || getNum1() > 2 * Math.PI)
        {
            System.out.println("Ângulo inválido. Insira um valor entre 0 e 360 graus.");

            addHistoricoDeOperacoes("Seno/Cosseno/Tangente de "+Math.toDegrees(getNum1())+"° = Erro");

            zerarcalculadora();

            return;
        }

        String equacaoGerada = ("Seno/Cosseno/Tangente de "+Math.toDegrees(getNum1())+"°");

        double valorSeno = Math.sin(getNum1());
        double valorCosseno = Math.cos(getNum1());
        double valorTangente = Math.tan(getNum1());

        System.out.print("Seno: "+String.format("%.2f", valorSeno)+"\nCosseno: "+String.format("%.2f", valorCosseno)+"\nTangente: "+String.format("%.2f", valorTangente)+"\n");

        addHistoricoDeOperacoes(equacaoGerada+"\nSeno("+Math.toDegrees(getNum1())+"°): "+String.format("%.2f", valorSeno)+"\nCosseno: ("+Math.toDegrees(getNum1())+"°)"+String.format("%.2f", valorCosseno)+"\nTangente: ("+Math.toDegrees(getNum1())+"°)"+String.format("%.2f", valorTangente));

        zerarcalculadora();
    }

}
