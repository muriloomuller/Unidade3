import java.util.Scanner;

public class Ex08UN3 {
    public Ex08UN3() {

        System.out.println("$ para R$");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor em $:");
        float $ = scan.nextFloat();

        scan.close();

        //valor do dolar hoje = R$5,00
        float X = ($ * 5.00f);

        System.out.print("O valor $" + $ + " em R$ fica = R$" + X);

    }
    public static void main(String[] args) {
        new Ex08UN3();
    }
}
