import java.util.Scanner;

public class InvestigaçãoCriminal

{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as perguntas com 'S' para sim e 'N' para não.");



        System.out.print("Telefonou para a vítima? ");

        char resposta1 = scanner.next().charAt(0);

        System.out.print("Esteve no local do crime? ");
        char resposta2 = scanner.next().charAt(0);



        System.out.print("Mora perto da vítima? ");
        char resposta3 = scanner.next().charAt(0);
        System.out.print("Devia para a vítima? ");
        char resposta4 = scanner.next().charAt(0);

        System.out.print("Já trabalhou com a vítima? ");
        char resposta5 = scanner.next().charAt(0);

        int countSim = 0;
        if (resposta1 == 'S' || resposta1 == 's') {

            countSim++;
        }

        if (resposta2 == 'S' || resposta2 == 's') {

        }
            countSim++;

        if (resposta3 == 'S' || resposta3 == 's') {

        }
            countSim++;



        if (resposta4 == 'S' || resposta4 == 's') {

        }
            countSim++;

        if (resposta5 == 'S' || resposta5 == 's')

            countSim++;



        if (countSim == 2) {

            System.out.println("Classificação: Suspeita");

        } else if (countSim >= 3 && countSim <= 4) {
            System.out.println("Classificação: Cúmplice");

        } else if (countSim == 5) {
            System.out.println("Classificação: Assassino");

        } else {
            System.out.println("Classificação: Inocente");

        }









        }


    }
