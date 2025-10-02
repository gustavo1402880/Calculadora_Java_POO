package com.example.funcoes.metodosMultiplos;

import com.Utillity;
import com.example.Calculadora;

public class MMC extends Calculadora
{
    public static void operacao()
    {
        Utillity.cls(30);

        if(!isNovoCiclo())
        {
            double resultadoAntecessor = (int)getUltimoResultado();
            
            setUltimoResultado((int) getUltimoResultado());

            System.out.print("MMC de "+getUltimoResultado()+" , ");
            setNum2(Utillity.rdInt());

            setNum2(Math.abs(getNum2()));

            int maior = Math.max((int)getUltimoResultado(),(int) getNum2());

            while (getUltimoResultado() % maior != 0 && getNum2() % maior != 0) 
            { 
                maior++;   
            }

            setUltimoResultado(maior);

            String equacaogerada = ("MMC de "+resultadoAntecessor+" e "+getNum2()+" = "+getUltimoResultado());

            addHistoricoDeOperacoes(equacaogerada);

            setNovoCiclo(false);

            return;
        }
        System.out.print("MMC: ");
        setNum1(Math.abs(Utillity.rdInt()));

        System.out.print(" , "+getNum1()+" , ");
        setNum2(Math.abs(Utillity.rdInt()));

        int maior = Math.max((int)getNum1(),(int)getNum2());

        while(getNum1() % maior != 0 && getNum2() % maior != 0)
        {
            maior++;
        }

        setUltimoResultado(maior);

        String equacaogerada = ("MMC de "+getNum1()+" e "+getNum2()+" = "+getUltimoResultado());

        addHistoricoDeOperacoes(equacaogerada);

        setNovoCiclo(false);

    }
}
