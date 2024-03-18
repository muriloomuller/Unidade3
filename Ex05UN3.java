import java.util.Scanner;

public class Ex05UN3 {
    public Ex05UN3() {

        System.out.println("CALCULAR GASTO DA GRANJA");

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos frangos há na granja? ");
        int quantFrango = scan.nextInt();

        scan.close();

        //R$4,00 chip + 3.50 x2 p/ frango = R$11,00
        Float custoFrango = (quantFrango * 11.0f);

        System.out.println("O valor total para " + quantFrango + " frangos é R$" + custoFrango);

    }
    public static void main(String[] args) {
        new Ex05UN3();
    }
}
