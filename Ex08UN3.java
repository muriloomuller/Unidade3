/*
Análise
Entrada = Valor prescrito em dólar
Saídas: Valor em dólar cotado para reais
Testes: 50, 100, 1000

Algoritmo:
Ler valor em $
Dado $ = 5,00
X = $ * 5,00
Saída = valor cotado
 */

import java.util.Scanner;

public class Ex08UN3 {
    public Ex08UN3() {

        System.out.println("$ para R$");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor em Dólar:");
        float $ = scan.nextFloat();

        scan.close();

        //valor do dolar aprox = R$5,00
        float X = ($ * 5.00f);

        System.out.print("O valor $" + $ + " em R$ fica = R$" + X);

    }
    public static void main(String[] args) {
        new Ex08UN3();
    }
}
