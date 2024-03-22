/*
 Análise
 Entrada = Peso do prato(kg)
 Saída = peso do prato multiplicado pelo valor do kg - tara do prato
 Testes: 1, 0.5, 0.750

 Algoritmo :
 Ler peso do prato em kg
 valor do kg = 25
 tara do prato = 0.750
 peso * kg - tara do prato
 Saída = valor final
 */

import java.util.Scanner;

public class Ex06UN3 {
    public Ex06UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Peso do prato em kg: ");
        Float peso = scan.nextFloat();

        scan.close();

        int kg = 25;
        float taraprato = 0.75f;

        Float valor = (peso * kg - taraprato);

        System.out.println("O cliente terá que pagar R$" + valor);

    }

    public static void main(String[] args) {
        new Ex06UN3();
    }

}
