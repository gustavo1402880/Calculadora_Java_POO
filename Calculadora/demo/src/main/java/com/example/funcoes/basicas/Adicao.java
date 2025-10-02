package com.example.funcoes.basicas;

import com.Utillity;
import com.example.Calculadora;

public class Adicao extends Calculadora
{
    public static void operacao()
    {
        Utillity.cls(30);

        if(!isNovoCiclo())
        {
            double resultadoAntecessor = getUltimoResultado();

            setUltimoResultado(getUltimoResultado() - getNum2());

            String equacaogerada = (resultadoAntecessor+" + "+getNum2()+" = "+getUltimoResultado());
            
            addHistoricoDeOperacoes(equacaogerada);

            setNovoCiclo(false);

            return;
        }

        System.out.print(": ");
        setNum1(Utillity.rdDouble());

        System.out.print(": "+getNum1()+" + ");
        setNum2(Utillity.rdDouble());

        setUltimoResultado(getNum1() + getNum2());

        String equacaogerada = (getNum1()+" + "+getNum2()+" = "+getUltimoResultado());
    
        addHistoricoDeOperacoes(equacaogerada);

        setNovoCiclo(false);
    }
}
