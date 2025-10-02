package com.example.funcoes.conversoes;

import com.Utillity;

public class ConversaoArmazenamento
{
    public static void menuConversaoArmazenamento()
    {
        System.out.println("=== Conversões de Armazenamento ===");
        System.out.println("1 - Bytes → KB");
        System.out.println("2 - KB → MB");
        System.out.println("3 - GB → MB");
        System.out.println("4 - TB → GB");
        int opArm = Utillity.rdInt();
        Utillity.rdString();

        switch (opArm) {
            case 1:
                System.out.print("Bytes: ");
                double bytes = Utillity.rdDouble();
                Utillity.rdString();

                System.out.println(bytes + " bytes = " +
                        ConversaoArmazenamento.bytesParaKB(bytes) + " KB");
                break;
            case 2:
                System.out.print("KB: ");
                double kb = Utillity.rdDouble();
                Utillity.rdString();

                System.out.println(kb + " KB = " +
                        ConversaoArmazenamento.kbParaMB(kb) + " MB");
                break;
            case 3:
                System.out.print("GB: ");
                double gb = Utillity.rdDouble();
                Utillity.rdString();

                System.out.println(gb + " GB = " +
                        ConversaoArmazenamento.gbParaMB(gb) + " MB");
                break;
            case 4:
                System.out.print("TB: ");
                double tb = Utillity.rdDouble();
                Utillity.rdString();


                System.out.println(tb + " TB = " +
                        ConversaoArmazenamento.tbParaGB(tb) + " GB");
                break;
            default:
                System.out.println("Erro: Opção Inválida!");
                Utillity.delay(2000);
        }
    }

    public static double bytesParaKB(double bytes)
    {
        return bytes / 1024.0;
    }

    public static double kbParaMB(double kb)
    {
        return kb * 1024.0;
    }

    public static double gbParaMB(double gb)
    {
        return  gb * 1024.0;
    }

    public static  double tbParaGB(double tb)
    {
        return tb * 1024.0;
    }
}
