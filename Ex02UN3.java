/*
 Análise
 Entrada = Valor do calçado
 Sáida = valor do calçado com desconto
 Testes : 800, 1000, 2000
 
 Algoritmo
 Ler valor do calçado
 Desconto = valor do calçado * 12 por 100
 Saída = valor do desconto e valor do sapato com desconto 
 */

import java.util.Scanner;

public class Ex02UN3 {
    public Ex02UN3() {
        
        System.out.println("Loja de sapato!!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do calçado: ");
        float valor = scan.nextFloat();

        scan.close();

        float desc = (valor * (12/100f));

        System.out.println("O valor do desconto é " + desc );
        System.out.println("O valor do sapato com desconto é " + (valor - desc));


    }
    public static void main(String[] args) {
        new Ex02UN3();
    }
}

