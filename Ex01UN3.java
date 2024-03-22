// Análise 








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