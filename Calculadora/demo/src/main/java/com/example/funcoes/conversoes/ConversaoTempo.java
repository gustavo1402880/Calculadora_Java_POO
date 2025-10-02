package com.example.funcoes.conversoes;

import com.Utillity;

public class ConversaoTempo
{
    public static void menuConversaoTempo()
    {
        System.out.println("=== Conversões de Tempo ===");
        System.out.println("1 - Segundos → Minutos");
        System.out.println("2 - Horas → Segundos");
        int opTempo = Utillity.rdInt();
        Utillity.rdString();

        if (opTempo == 1) {
            System.out.print("Digite os segundos: ");
            double seg = Utillity.rdDouble();
            Utillity.rdString();

            System.out.println(seg + " segundos = " +
                    ConversaoTempo.segundosParaMinutos(seg) + " minutos");
        }
        else if (opTempo == 2)
        {
            System.out.print("Digite as horas: ");
            double horas = Utillity.rdDouble();
            Utillity.rdString();
            System.out.println(horas + " horas = " +
                    ConversaoTempo.horasParaSegundos(horas) + " segundos");
        }
        else
        {
            System.out.println("Erro: Opção Inválida!");
            Utillity.delay(2000);
        }
    }

    public static double segundosParaMinutos(double segundos)
    {
        return segundos / 60.0;
    }
    public static double horasParaSegundos(double horas)
    {
        return horas * 3600.0;
    }
}
