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
