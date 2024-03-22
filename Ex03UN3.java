/*
 Análise
 Entrada = Valor do litro da gasolina, valor à abastecer
 Sáida = Quantidade abastecida em litros
 Testes : 5, 50, 6, 100, 5.5, 200
 
 Algoritmo
 Ler  valor do litro da gasolina e valor abastecido
 valor = valor abastecido por valor da gasolina
 Saída = Litros abastecidos
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03UN3 {
    public Ex03UN3(){

        System.out.println("Combustivel!!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do litro da gasolina: ");
        float valorgasolina = scan.nextFloat();
        
        System.out.print("Digite o valor que deseja abastecer: ");
        float abastecer = scan.nextFloat();

        float f = (abastecer / valorgasolina);

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Você abasteceu " + df.format(f) + " Litros");

        scan.close();

    }   
    public static void main(String[] args) {
        new Ex03UN3();
    } 
}
