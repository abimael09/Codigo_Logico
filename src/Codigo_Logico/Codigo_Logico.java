package Codigo_Logico;

import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;

public class Codigo_Logico{
    
    public static void main(String[] args){
        
        final String nome = "Abimael Santos";
        System.out.println("Nome: " + nome+"\n");
        
        int numPar = 20; double numDecimal = 14.5; String palavra = "Tecnologia"; boolean algoritmo = true;
        System.out.println("Par = "+numPar+" | Decimal = "+numDecimal+" | Palavra = "+palavra+" | Algoritmo = "+algoritmo+"\n");
        
        int valorX = 10, valorY;
        valorY = valorX++;
        System.out.println("X = "+valorX+"  "+"Y = "+valorY);
        
        valorY = valorX--;
        System.out.println("X = "+valorX+"  "+"Y = "+valorY+"\n");
        
        valorY = ++valorX;
        System.out.println("X = "+valorX+"  "+"Y = "+valorY);
        
        valorY = --valorX;
        System.out.println("X = "+valorX+"  "+"Y = "+valorY);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        
        double itenVenda1 = 2.95, itenVenda2 = 3.50, custoTotalItens;
        System.out.println("1° Iten = "+itenVenda1+"  |  2° Iten = "+itenVenda2+"\n");
        
        custoTotalItens = itenVenda1 + itenVenda2;
        System.out.println("Custo Total dos Itens = "+custoTotalItens+" R$\n");
        
        final double taxa = 8.25;
        double Percentual = taxa*custoTotalItens/100;
        System.out.println("Desconto da Taxa = "+Percentual);
        
        double operacao1 = itenVenda1 - Percentual;
        double operacao2 = itenVenda2 - Percentual;
        double novoValorTotal = operacao1 + operacao2;
        System.out.println("Novo valor Total = "+novoValorTotal);
        
        DecimalFormat df = new DecimalFormat("0.##");
        String dx = df.format(novoValorTotal);
        System.out.println("Total = "+dx+" R$\n");
        
        int a = 4, b = 2, c = -8, d = 3, e = 8;
        
        int operac1 = c + (e / 2) - a * b;
        int operac2 = c *a % e - c /2;
        int operac3 = c * (a % e) - c /2;
        boolean operac4 = (a + 1 >= b / 2) || (c == (4 + b));
        boolean operac5 = (b < (a + b / c)) || ((1 != 0) ^ (2 < 3));
        
        System.out.println("1) Operação = "+operac1+"  |  2) Operação = "+operac2+"  |  3) Operação = "+operac3+
                "  |  4) Operação = "+operac4+"  |  5) Operação = "+operac5+"\n");
        
        String salario = "1.000 R$";
        double comissao = 4.5; double salarioBase = 1.000;
        double salarioFinal = salarioBase + comissao / 100;
        System.out.println("Comissão = "+comissao+"%");
        System.out.println("Salário Base = "+salario);
        System.out.println("Salário Final = "+salarioFinal+" R$\n");
    }
}