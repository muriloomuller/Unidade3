/*
Análise
Entrada = Distância percorrida em KM, tempo gasto em HORAS
Saída = Velocidade média / Quantidade de combustível
Teste: 5, 10, 20, 15

Algoritmo
Ler distância e tempo gasto
Calculo velocidade média = distancia por tempo
Calculo combustível  = distância por 12

Saída = Velocidade média em KM/h e combustível gasto na viagem 
 */

 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex14UN3 {
    public Ex14UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a distância percorrida pelo motorista (em km): ");
        float distancia = scan.nextFloat();

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        float tempo = scan.nextFloat();

        scan.close();

        float velMedia = distancia / tempo;
        float combustivel = distancia / 12;

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("A velocidade média é " + velMedia + "km/h e o combustível gasto na viagem é " + df.format(combustivel) + " Litros.");
    }

    public static void main(String[] args) {
        new Ex14UN3();
    }
}