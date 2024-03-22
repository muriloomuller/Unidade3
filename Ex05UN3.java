/*
Análise
Entrada = quantidade de frangos
Saída = quantidade de frangos multiplicado pelo custo   
Testes: 280, 25, 100

Algoritmo :
Ler quantidade de frangos
R$4,00 chip + 3.50 x2 p/ frago = R$11,00 (custo)
Quantidade de frangos * 11
Saída = custo da quantidade de frangos
 */


import java.util.Scanner;

public class Ex05UN3 {
    public Ex05UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos frangos há na granja? ");
        int quantFrango = scan.nextInt();

        scan.close();

        int custoFrango = (quantFrango * 11);

        System.out.println("O valor total para " + quantFrango + " frangos é R$" + custoFrango);

    }
    public static void main(String[] args) {
        new Ex05UN3();
    }
}
