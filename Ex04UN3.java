
import java.util.Scanner;

public class Ex04UN3 {
    public Ex04UN3() {

        System.out.println("CALCULAR MEDIA:");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Float nota1 = scan.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = scan.nextFloat();

        scan.close();

        // Peso das notas
        int peso1 = 5;
        int peso2 = 3;
        int peso3 = 2;

        float mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada é:" + mediaPonderada);

    }

    public static void main(String[] args) {
        new Ex04UN3();
    }
}
