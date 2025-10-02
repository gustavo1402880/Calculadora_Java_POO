package com.example.funcoes.complexas;

import com.Utillity;
import com.example.Calculadora;

public class Fatorial extends Calculadora
{
    public static void operacao()
    {
        Utillity.cls(30);

        if(!isNovoCiclo())
        {
            int resultadoAntecessor = (int) getUltimoResultado();

            System.out.print(getUltimoResultado()+"! = ");

            if(getUltimoResultado() < 0 || getUltimoResultado() != (int) getUltimoResultado())
            {
                System.out.println("Fatorial não definido para números negativos ou não inteiros.");

                addHistoricoDeOperacoes(getUltimoResultado()+"! = Erro");

                zerarcalculadora();

                return;
            }
            
            setUltimoResultado(resultadoAntecessor * resultadoAntecessor - 1);

            for(int i = (int) getUltimoResultado() - 2; i > 0; i--)
            {
                setUltimoResultado((int) getUltimoResultado() * i);
            }

            String equacaoGerada = (resultadoAntecessor+"! = "+getUltimoResultado());

            addHistoricoDeOperacoes(equacaoGerada);

            setNovoCiclo(false);
        }
        System.out.print(": ");
        setNum1(Math.abs(Utillity.rdInt()));

        if(getNum1() < 0)
        {
            System.out.println("Fatorial não definido para números negativos.");

            addHistoricoDeOperacoes(getNum1()+"! = Erro");

            zerarcalculadora();

            return;
        }

        setUltimoResultado(getNum1());

        for(int i = (int) getNum1() - 1; i > 1; i--)
        {
            setUltimoResultado((int) getUltimoResultado() * i);
        }

        String equacaoGerada = ((int) getNum1()+"! = "+(int) getUltimoResultado());

        addHistoricoDeOperacoes(equacaoGerada);

        setNovoCiclo(false);
    }
}
