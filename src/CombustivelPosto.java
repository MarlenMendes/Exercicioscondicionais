import javax.swing.*;
import java.util.Scanner;

public class CombustivelPosto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Informe o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoGasolina = 2.50;
        double precoAlcool = 1.90;

        double valorPagar = 0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {

        }
            if (litros <= 20) {
                valorPagar = litros * precoAlcool * 0.97; // 3% de desconto
            } else {

                valorPagar = litros * precoAlcool * 0.95; // 5% de desconto

                // else if (tipoCombustivel == 'G' || tipoCombustivel == 'g')

                if (litros <= 20) {
                    valorPagar = litros * precoGasolina * 0.96; // 4% de desconto

                } else {

                    valorPagar = litros * precoGasolina * 0.94; // 6% de desconto


                }System.out.println("Valor a ser pago: R$ " + valorPagar);


                    {

                }


    }








    }
}
