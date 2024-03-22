//azulejo = 12.50
/*
Análise
Entrada = Altura e comprimento em METROS
Saída = Calculo do valor gasto de azulejos
Teste: 10, 15, 20, 30, 40.5, 34.5

Algoritmo
Ler altura e comprimento 
Preço por azulejo = 12.5
Quantidade de azulejos por metro = 9
Calcular area = altura * comprimento
Multiplicar area por azulejos p/ metro
Custo total de azulejos = quantidade * preço por azulejo

Saída = Quantidade / Custo
 */

import java.util.Scanner;

public class Ex13UN3 {
    public Ex13UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura da parede em METROS: ");
        double altura = scan.nextDouble();

        System.out.print("Digite o comprimento da parede em METROS: ");
        double comprimento = scan.nextDouble();

        scan.close();

        double precoPorAzulejo = 12.50;
        int AzulejosPorMetro = 9;

        double area = comprimento * altura;
        
        //Math.ceil = arredonda o resultado para cima p/ o prox número inteiro = 10,4 azulejos, a função Math.ceil retornará 11
        int quantidadeAzulejos = (int)Math.ceil(area * AzulejosPorMetro);

        double custoTotal = quantidadeAzulejos * precoPorAzulejo;


        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);
        System.out.println("Custo total: R$ " + custoTotal);

    }
    public static void main(String[] args) {
        new Ex13UN3();
    }
    
}
