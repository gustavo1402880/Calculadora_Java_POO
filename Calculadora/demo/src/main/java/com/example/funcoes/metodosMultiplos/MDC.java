package com.example.funcoes.metodosMultiplos;

import com.Utillity;
import com.example.Calculadora;

public class MDC extends  Calculadora
{
    public static void operacao()
    {
        Utillity.cls(30);

        if(!isNovoCiclo())
        {
            System.out.print("MDC: "+(int)getUltimoResultado()+" , ");
            setNum2((int)Utillity.rdInt());

            int resultadoAntecessor = (int) getUltimoResultado();

            int maior = Math.max((int)getUltimoResultado(),(int) getNum2());
            int menor = Math.min((int)getUltimoResultado(),(int) getNum2());

            while(maior % menor != 0)
            {
                int resto = maior % menor;
                maior = menor;
                menor = resto;
            }

            setUltimoResultado(maior);

            String equacaogerada = ("MDC de "+resultadoAntecessor+" e "+getNum2()+" = "+getUltimoResultado());

            addHistoricoDeOperacoes(equacaogerada);

            setNovoCiclo(false);

            return;
        }
        System.out.print("MDC: ");
        setNum1(Math.abs(Utillity.rdInt()));

        System.out.print(" , ");
        setNum2(Math.abs(Utillity.rdInt()));

        int maior = Math.max((int)getNum1(),(int)getNum2());
        int menor = Math.min((int)getNum1(),(int)getNum2());

        while(maior % menor != 0)
        {
            int resto = maior % menor;
            maior = menor;
            menor = resto;
        }

        setUltimoResultado(maior);

        String equacaogerada = ("MDC de "+getNum1()+" e "+getNum2()+" = "+getUltimoResultado());

        addHistoricoDeOperacoes(equacaogerada);

        setNovoCiclo(false);
    }
}
