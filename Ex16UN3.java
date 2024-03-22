/*
Análise
Entrada = Valor da compra e valor pago em R$
Saída = Troco
Teste: 550, 600, 256

Algoritmo
Ler valor compra e valor pago
troco = valor da compra - valor pago
quantidade de notas de 100, 10, 1 usando %(resto da div)
Saída = Número minimo de notas de 100, 10 e 1 para o troco 
 */

import java.util.Scanner;

public class Ex16UN3 {
    public Ex16UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da compra:");
        int compra = scan.nextInt();

        System.out.print("Digite o valor pago em R$: ");
        int pago = scan.nextInt();

        scan.close();

        int troco = compra - pago;
        int notas100 = troco / 100;
        troco %= 100;
        int notas10 = troco / 10;
        troco %= 10;
        int moedas1 = troco;


        System.out.println("Número mínimo de notas para o troco:  ");
        System.out.println("Notas de R$100: " + notas100);
        System.out.println("Notas de R$10: " + notas10);
        System.out.println("Moedas de R$1: " + moedas1);

    }
    public static void main(String[] args) {
        new Ex16UN3();
    }
    
}
