import java.util.Scanner;

public class Ex07UN3 {
    public Ex07UN3(){

        System.out.println("Calcular litros de refrigerante");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml compradas: ");
        int latas = scan.nextInt();

        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        int garrafas = scan.nextInt();

        System.out.print("Digite a quantidade de garrafas de 2L: ");
        int garrafas2 = scan.nextInt();

        scan.close();

        int litroFinal = (latas * 350 + garrafas * 600 + garrafas2 * 2000);

        System.out.println("A quantidade de litros de refrigerante compradas é: " + litroFinal + "L");

    }
    public static void main(String[] args) {
        new Ex07UN3();
    }
}
