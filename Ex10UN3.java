/*
Análise
Entrada = valor cateto1, cateto2
Saídas = calculo hipotenusa
Testes: 5, 7, 4.5

Algoritmo :
Ler cateto1 e cateto2
cateto1^2 + cateto2^2
Saída = hipotenusa   
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ex10UN3 {
    public Ex10UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do cateto 1: ");
        Double cateto1 = scan.nextDouble();

        System.out.print("Digite o valor do cateto 2: ");
        Double cateto2 = scan.nextDouble();

        scan.close();

        Double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.print("O valor da hipotenusa é " + df.format(hipotenusa));

    }

    public static void main(String[] args) {
        new Ex10UN3();
    }
}
