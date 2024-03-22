/*
 Análise
 Entrada = Temperatura em C°
 Saída = Temperatura em °F
 Teste: 30, 25, 10


 Algoritmo
 Ler temperatura em °C
Conversor = 9/5 * Temperatura em °C + 32
Saída = Temperatura convertida para °F

 


 */




import java.util.Scanner;

public class Ex11UN3 {
    public Ex11UN3() {

        System.out.println("Conversor °C para °F");

        Scanner scan = new Scanner(System.in);

        System.out.print("INFORME a temperatura em C°: ");
        float tempC = scan.nextFloat();

        scan.close();

        float F = (9/5) * tempC + 32;

        System.out.print("A temperatura convertida para °F é = " + F);

    }
    public static void main(String[] args) {
        new Ex11UN3();
    }
    
}
