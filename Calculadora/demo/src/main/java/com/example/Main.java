package com.example;

import java.util.InputMismatchException;

import com.Utillity;
import com.example.funcoes.basicas.Adicao;
import com.example.funcoes.basicas.Divisao;
import com.example.funcoes.basicas.Multiplicacao;
import com.example.funcoes.basicas.Subtracao;
import com.example.funcoes.complexas.Fatorial;
import com.example.funcoes.complexas.Potenciacao;
import com.example.funcoes.complexas.Radiciacao;
import com.example.funcoes.equacoesEspeciais.EquacaoPrimeiroGrau;
import com.example.funcoes.equacoesEspeciais.EquacaoSegundoGrau;
import com.example.funcoes.equacoesTrigonometricas.SenoCossenoTangente;
import com.example.funcoes.metodosMultiplos.MDC;
import com.example.funcoes.metodosMultiplos.MMC;

public class Main {
    public static void main(String[] args) 
    {
        menu();
    }
    public static  void  menu()
    {
        int opcao = 0;

        System.out.println(".-.-.-. CALCULADORA IRADA .-.-.-.");
        
        do
        {
            System.out.println("\n: "+Calculadora.getUltimoResultado());
            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Potenciação");
            System.out.println("[6] - Radiciação");
            System.out.println("[7] - Fatorial");
            System.out.println("[8] - MDC");
            System.out.println("[9] - MMC");
            System.out.println("[10] - Histórico de Operações");
            System.out.println("[11] - Valor Absoluto do Resultado");
            System.out.println("[12] - Equação do 1º Grau");
            System.out.println("[13] - Equação do 2º Grau");
            System.out.println("[14] - Calcular Seno Cosseno e Tangente");
            System.out.println("[15] - Zerar Calculadora");
            System.out.println("[16] - Sair");

            Utillity.cls(1);

            System.out.print("[•] - Escolha uma opção: ");

            try
            {
                opcao = Utillity.rdInt();
                Utillity.rdString();

                switch(opcao)
                {
                    case 1 -> Adicao.operacao();
                    case 2 -> Subtracao.operacao();
                    case 3 -> Multiplicacao.operacao();
                    case 4 -> Divisao.operacao();
                    case 5 -> Potenciacao.operacao();
                    case 6 -> Radiciacao.operacao();
                    case 7 -> Fatorial.operacao();
                    case 8 -> MDC.operacao();
                    case 9 -> MMC.operacao();
                    case 10 -> Calculadora.mostrarHistoricoDeOperacoes();
                    case 11 -> Calculadora.setUltimoResultado(Math.abs(Calculadora.getUltimoResultado()));
                    case 12 -> EquacaoPrimeiroGrau.operacao();
                    case 13 -> EquacaoSegundoGrau.operacao();
                    case 14 -> SenoCossenoTangente.inserirDadosGraus();
                    case 15 -> Calculadora.zerarcalculadora();
                    case 16 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção Inválida!\nTente Novamente!");
                }
            
            }
            catch(InputMismatchException e)
            {
                System.out.println("Opção Inválida!");
            }
        }
        while(opcao != 16);
    }
}