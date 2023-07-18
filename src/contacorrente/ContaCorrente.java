package contacorrente;

import java.util.Scanner;

public class ContaCorrente extends Conta{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Abrindo a Conta

        System.out.println("Bem Vindo ao Banco Teste");
        System.out.println("***********************");
        System.out.println("Digite seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Qual tipo de conta:");
        String tipoConta = leitura.nextLine();
        System.out.println("Qual o seu saldo:");
        double saldo = leitura.nextDouble();

        Conta novaConta = new Conta();
        novaConta.Conta(nome,tipoConta,saldo);

        System.out.println(" ");

        novaConta.imprimi();

        //Operações da conta

        int opcao = 0;

        String menu = """
                    ****  Digite sua opção  ****
                    
                        1 - Consultar o saldo
                        2 - Transferir valor
                        3 - Receber valor
                        4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é: R$ " + novaConta.getSaldo());
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir: ");
                double transferi;
                transferi = leitura.nextDouble();

                if (transferi > novaConta.getSaldo()){
                    System.out.println("Saldo insulficiente!");
                } else {
                    novaConta.transferiValor(transferi);
                }
            } else if (opcao == 3){
                System.out.println("Qual valor deseja depositar: ");
                double recebe;
                recebe = leitura.nextDouble();
                novaConta.recebeValor(recebe);
            } else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }
        }

        System.out.println("Aplicação Finalizada!");

    }
}
