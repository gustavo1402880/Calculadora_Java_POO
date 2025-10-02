package com.example.funcoes.equacoesEspeciais;

import com.Utillity;
import com.example.Calculadora;

public class EquacaoPrimeiroGrau extends Calculadora{

    public static void operacao()
    {
        System.out.print("E1G: ");
        setNum1(Utillity.rdDouble());

        System.out.print("x  +  ");
        setNum2(Utillity.rdDouble());
        
        System.out.print(" = ");
        double resultado = Utillity.rdDouble();

        if(getNum1() == 0)
        {
           if(getNum2() == resultado)
           {
                System.out.println("Infinitas soluções possíveis.");

                addHistoricoDeOperacoes(getNum1()+"x + "+getNum2()+" = "+resultado+"  -> Infinitas soluções possíveis.");
           }
           else
           {
                System.out.println("Não existe solução possível.");

                addHistoricoDeOperacoes(getNum1()+"x + "+getNum2()+" = "+resultado+"  -> Não existe solução possível.");
           }
            return;
        }

        int numerador = ((int) resultado - (int) getNum2());
        int denominador = (int) getNum1();

        int divisor = mdc(Math.abs(numerador), Math.abs(denominador));

        numerador /= divisor;
        denominador /= divisor;

         double valorDecimal = (double) numerador / denominador;

        System.out.println("Equação: " + (int)getNum1() + "x + " + (int)getNum2() + " = " + resultado);
        System.out.println("Solução: x = " + numerador + "/" + denominador +"  (≈ " + valorDecimal + ")");

        String equacaoGerada = (getNum1()+"x + "+getNum2()+" = "+resultado+"  -> x = "+numerador+"/"+denominador+"  (≈ "+valorDecimal+")");

        addHistoricoDeOperacoes(equacaoGerada);

        zerarcalculadora();
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
