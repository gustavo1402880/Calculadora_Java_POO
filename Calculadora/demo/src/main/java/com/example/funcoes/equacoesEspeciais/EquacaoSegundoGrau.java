package com.example.funcoes.equacoesEspeciais;

import com.Utillity;
import com.example.Calculadora;

public class EquacaoSegundoGrau extends Calculadora 
{
    public static void operacao()
    {
        System.out.print("E2G: ");
        setNum1(Utillity.rdDouble());

        System.out.print("E2G: "+getNum1()+"x² + ");
        setNum2(Utillity.rdDouble());

        System.out.print("E2G: "+getNum1()+"x² + "+getNum2()+"x + ");
        double c = Utillity.rdDouble();

        System.out.print("E2G: "+getNum1()+"x² + "+getNum2()+"x + "+c+" = ");
        double resultado = Utillity.rdDouble();

        if(getNum1() == 0)
        {
            System.out.println("Não é uma equação do segundo grau.");

            addHistoricoDeOperacoes(getNum1()+"x² + "+getNum2()+"x + "+c+" = "+resultado+"  -> Não é uma equação do segundo grau.");

            zerarcalculadora();

            return;
        }

        if(resultado != 0)
        {
            c -= resultado;
        }

        int a = (int) getNum1();
        int b = (int) getNum2();

        int delta = b * b - 4 * a * (int) c;

        if(delta < 0)
        {
            System.out.println("Não existem raízes reais.");

            addHistoricoDeOperacoes(a+"x² + "+b+"x + "+(int)c+" = 0  -> Não existem raízes reais.");

            zerarcalculadora();

            return;
        }

        int sqrtDelta = (int) Math.sqrt(delta);

        int x1Numerador = -b + sqrtDelta;
        int x2Numerador = -b - sqrtDelta;
        int denominador = 2 * a;

        int divisorX1 = mdc(Math.abs(x1Numerador), Math.abs(denominador));
        int divisorX2 = mdc(Math.abs(x2Numerador), Math.abs(denominador));

        x1Numerador /= divisorX1;
        x2Numerador /= divisorX2;

        denominador /= divisorX1;

        double valorDecimalX1 = (double) x1Numerador / denominador;
        double valorDecimalX2 = (double) x2Numerador / denominador;

        System.out.println("Equação: "+a+"x² + "+b+"x + "+(int)c+" = 0");
        System.out.println("Soluções: x₁ = "+x1Numerador+"/"+denominador+" (≈ "+valorDecimalX1+") e x₂ = "+x2Numerador+"/"+denominador+" (≈ "+valorDecimalX2+")");

        String equacaoGerada = (a+"x² + "+b+"x + "+(int)c+" = 0  -> x₁ = "+x1Numerador+"/"+denominador+" (≈ "+valorDecimalX1+") e x₂ = "+x2Numerador+"/"+denominador+" (≈ "+valorDecimalX2+")");

        addHistoricoDeOperacoes(equacaoGerada);

        if(valorDecimalX1 == valorDecimalX1)
        {
            setUltimoResultado(valorDecimalX1);

            setNovoCiclo(false);
        }
        else
        {
            zerarcalculadora();
        }
    }
    public static int mdc(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return mdc(b, a % b);
    }
}
