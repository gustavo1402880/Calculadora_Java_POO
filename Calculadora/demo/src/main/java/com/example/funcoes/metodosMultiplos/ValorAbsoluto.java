package com.example.funcoes.metodosMultiplos;

import com.Utillity;
import com.example.Calculadora;

public class ValorAbsoluto extends Calculadora 
{
    public static void opracao()
    {
        Utillity.cls(30);

        if(!isNovoCiclo())
        {
            double resultadoAntecessor = getUltimoResultado();

            setUltimoResultado(Math.abs(getUltimoResultado()));

            String equacaogerada = ("|"+resultadoAntecessor+"| = "+getUltimoResultado());

            addHistoricoDeOperacoes(equacaogerada);

            setNovoCiclo(false);

            return;
        }
        System.out.print(": ");
        setNum1(Math.abs(Utillity.rdDouble()));

        setUltimoResultado(getNum1());

        String equacaogerada = ("|"+getNum1()+"| = "+getUltimoResultado());

        addHistoricoDeOperacoes(equacaogerada);

    }

}
