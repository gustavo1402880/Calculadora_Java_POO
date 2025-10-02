package com.example.funcoes.conversoes;

import com.Utillity;

public class ConversaoProcessamento
{
    public static void menuConversaoProcessamento()
    {
        System.out.println("=== Conversões de Processamento ===");
        System.out.println("1 - GHz → MHz");
        System.out.println("2 - MHz → GHz");
        int opProc = Utillity.rdInt();
        Utillity.rdString();

        if (opProc == 1) {
            System.out.print("GHz: ");
            double ghz = Utillity.rdDouble();
            Utillity.rdString();

            System.out.println(ghz + " GHz = " +
                    ConversaoProcessamento.ghzParaMhz(ghz) + " MHz");
        } else if (opProc == 2) {
            System.out.print("MHz: ");
            double mhz = Utillity.rdDouble();
            Utillity.rdString();

            System.out.println(mhz + " MHz = " +
                    ConversaoProcessamento.mhzParaGhz(mhz) + " GHz");
        }
        else
        {
            System.out.println("Erro: Opção Inválida!");
            Utillity.delay(2000);
        }
    }

    public static double ghzParaMhz(double ghz)
    {
        return ghz * 1000.0;
    }

    public static double mhzParaGhz(double mhz)
    {
        return mhz / 1000.0;
    }
}
