/*
Análise
Entrada = Número inteiro de até 3 digitos
Saída = Número decomposto em unidade, dezena e centena
Teste: 150, 294, 589

Algoritmo
Ler número prescrito pelo usuário
Calcular centena, unidade, dezena com % (resto da divisão)
Saída = Número decomposto
 */

import java.util.Scanner;

public class Ex15UN3 {
    public Ex15UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro com até 3 digitos: ");
        int n = scan.nextInt();

        scan.close();

        int ncentena = n / 100;
        int ndezena = (n % 100) / 10;
        int nunidade = n % 10;

        System.out.println(ncentena + " centena(s) " + ndezena + " dezena(s) " + nunidade + " unidade(s)");

    }

    public static void main(String[] args) {
        new Ex15UN3();
    }

}
