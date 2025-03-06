package application;

import entities.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);
        menu();
        System.out.println("Escolha uma opcao: ");
        int option = scan.nextInt();

        while (option != 3){
            switch (option){
                case 1:
                {
                    System.out.println("Digite o valor do produto:");
                    double produto = scan.nextDouble();
                    System.out.println("Digite a quantidade do produto:");
                    int quantidade = scan.nextInt();
                    calculadora = new Calculadora(produto, quantidade);
                    System.out.println("Valor total da compra: " + calculadora.totalValue());
                    break;
                }
                case 2:
                {
                    System.out.println("Digite o valor do pagamento: ");
                    double pagamento = scan.nextDouble();
                    System.out.println("Troco: " + calculadora.change(calculadora.totalValue(), pagamento));
                    break;
                }
                default:
                {
                    break;
                }
            }
            menu();
            System.out.println("Escolha uma opcao: ");
            option = scan.nextInt();
        }

    }


    public static void menu ()
    {
        System.out.println(
                "[1] - Calcular Preço Total \n" + "[2] - Calcular Troco\n" + "[3] - Sair  \n"  );
    }
}