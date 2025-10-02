package com;

import java.util.Scanner;

public class Utillity 
{
    static Scanner sc = new Scanner(System.in);

    public static String rdString()
    {
        return sc.nextLine();
    }
    public static double rdDouble()
    {
        return sc.nextDouble();
    }
    public static int rdInt()
    {
        return sc.nextInt();
    }
    public static void cls(int numDeLinhas)
    {
        for(int i = 0; i< numDeLinhas; i++)
        {
            System.err.println();
        }
    }
    public static void delay(int tempoDelay)
    {
        try
        {
            Thread.sleep(tempoDelay);
        }
        catch(InterruptedException e)
        {
            System.out.println("Falha na execução do Programa!");
        }
    }
    public static boolean hasNextInt()
    {
        return sc.hasNextInt();
    }
}
