/*
Análise
Entrada = Quantidade de latas/garrafas compradas (350ml, 600ml e 2L)
Saídas = Quantidade de latas * quantidade de ML/Litros contido.
Testes: 4, 3, 8 / 14, 25, 36

Algoritmo :
Ler latas/garrafas compradas
latas350 * 350 + garrafas600 * 600 + garrafas2L * 2000
Saída = Quantidade de Litros ou ML compradas
 */



import java.util.Scanner;

public class Ex07UN3 {
    public Ex07UN3(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml compradas: ");
        int latas = scan.nextInt();

        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        int garrafas = scan.nextInt();

        System.out.print("Digite a quantidade de garrafas de 2L: ");
        int garrafas2 = scan.nextInt();

        scan.close();

        int litroFinal = (latas * 350 + garrafas * 600 + garrafas2 * 2000);

        System.out.println("A quantidade de litros de refrigerante é: " + litroFinal + "L");

    }
    public static void main(String[] args) {
        new Ex07UN3();
    }
}
