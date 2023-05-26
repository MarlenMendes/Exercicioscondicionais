import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;

        double ir = 0;

        if (salarioBruto > 900 && salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            ir = salarioBruto * 0.1;
        } else if (salarioBruto > 2500) {
            ir = salarioBruto * 0.2;

            double fgts = salarioBruto * 0.11;
            double salarioLiquido = salarioBruto - inss - ir;

            System.out.println("\nFolha de Pagamento\n");
            System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
            System.out.printf("(-) IR: R$ %.2f%n", ir);
            System.out.printf("(-) INSS: R$ %.2f%n", inss);
            System.out.printf("FGTS: R$ %.2f%n", fgts);
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
        }


    }
}
