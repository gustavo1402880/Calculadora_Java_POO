package com.example.funcoes.complexas;

import com.Utillity;
import com.example.Calculadora;

public class Radiciacao extends Calculadora
{
    public static void operacao()
    {
        Utillity.cls(30);

        if(!isNovoCiclo())
        {
            double ultimoResultado = getUltimoResultado();

            setUltimoResultado(Math.abs(getUltimoResultado()));

            setUltimoResultado(Math.sqrt(getUltimoResultado()));

            String equacaogerada = ("√"+ultimoResultado+" = "+getUltimoResultado());

            addHistoricoDeOperacoes(equacaogerada);
            
            return;
        }
        System.out.print(": ");
        setNum1(Utillity.rdInt());

        setNum1(Math.abs(getNum1()));

        System.out.print(": √"+getNum1());

        setUltimoResultado(Math.sqrt(getNum1()));

        String equacaogerada = ("√"+getNum1()+" = "+getUltimoResultado());

        addHistoricoDeOperacoes(equacaogerada);

        setNovoCiclo(false);
    }
}
