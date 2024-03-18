//azulejo = 12.50

import java.util.Scanner;

public class Ex13UN3 {
    public Ex13UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura da parede em METROS: ");
        float altura = scan.nextFloat();

        System.out.print("Digite o comprimento da parede em METROS: ");
        float comprimento = scan.nextFloat();

        scan.close();

        float paredetotal = comprimento * altura * 9;
        

        System.out.print("O valor total de gastos com azulejo é de R$" + paredetotal);


    }
    public static void main(String[] args) {
        new Ex13UN3();
    }
    
}
