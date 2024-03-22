/*
Análise
Entrada = Nome do funcionário, horas de trabalho, número de dependentes
Saída = Calculo salário bruto e líquido do funcionário
Teste: 10, 2, 40, 1, 80, 3

Algoritmo

((Salário é calculado a partir de R$ 10,00 por hora e R$ 60,00 por dependente. Descontos de 8,5% para INSS e 5% para imposto de renda são aplicados sobre o salário.))

Salário bruto = Quantidade de horas * 10 + Número de dependentes * 60

Calcular descontos

Liquido = Salário bruto - descontos

Saída = Salário liquido de X funcionário / Salário bruto de X funcionário
 */




import java.util.Scanner;

public class Ex12UN3 {
    public Ex12UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String funcionario = scan.nextLine();

        System.out.print("Digite a quantidade de horas de trabalho: ");
        int horas = scan.nextInt();

        System.out.print("Digite quantos dependetes tem o(a) " + funcionario + ":");
        int dependentes = scan.nextInt();

        scan.close();

        double taxaINSS = 0.085;
        double taxaIR = 0.05;

        double Bruto = ((horas * 10 ) + (dependentes * 60));

        double descontoINSS = Bruto * taxaINSS;
        double descontoIR = Bruto * taxaIR;

        
        double Liquido = Bruto - descontoINSS - descontoIR;


        System.out.print("O sálario líquido de " + funcionario + " é R$" + Liquido);

        System.out.print("O sálario bruto de " + funcionario + " é R$" + Bruto);

    }
    public static void main(String[] args) {
        new Ex12UN3();
    }
}
