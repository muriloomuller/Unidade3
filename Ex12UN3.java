//R$10 P/ hora 8.5% + 5% = 13.5% de desconto
//R$60 P/ CABECA  



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
