package com.example.funcoes.conversoes;

import com.Utillity;

public class ConversaoRede
{
    public static void menuConversaoRede()
    {
        System.out.println("=== Conversões de Rede ===");
        System.out.println("1 - Mbps → MB/s");
        System.out.println("2 - Gbps → Mbps");
        int opRede = Utillity.rdInt();
        Utillity.rdString();

        if (opRede == 1) {
            System.out.print("Mbps: ");
            double mbps = Utillity.rdDouble();
            Utillity.rdString();

            System.out.println(mbps + " Mbps = " +
                    ConversaoRede.mbpsParaMBps(mbps) + " MB/s");
        } else if (opRede == 2) {
            System.out.print("Gbps: ");
            double gbps = Utillity.rdDouble();
            Utillity.rdString();

            System.out.println(gbps + " Gbps = " +
                    ConversaoRede.gbpsParaMbps(gbps) + " Mbps");
        }
        else
        {
            System.out.println("Erro: Opção Inválida!");
            Utillity.delay(2000);
        }
    }

    public static double mbpsParaMBps(double mbps)
    {
        return mbps / 8.0;
    }

    public static double gbpsParaMbps(double gbps)
    {
        return gbps * 1000.0;
    }
}
