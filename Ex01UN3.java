/*
 Análise
 Entrada = Largura e comprimento do terreno
 Sáida = Calculo da área do terreno
Testes : 15, 20, 50, 60, 80, 50
 
 Algoritmo
 Ler largura e comprimento
 calcular área = largura * comprimento
 Saída = Área do terreno 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01UN3 {
    public Ex01UN3() {
        System.out.println("Area do terreno");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        float larg = scan.nextFloat();

        System.out.print("Digite o comprimento do terreno: ");
        float comp = scan.nextFloat();

        scan.close();

        float area = larg * comp;


        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("O terreno tem " + df.format(area) + " m2");




    }
    public static void main(String[] args) {
        new Ex01UN3();
    }

}