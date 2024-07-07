import java.util.Scanner;

public class desafio {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double saldoTotal = 2500;
            double saque = 0;
            double deposito = 0;
            int opcao = 0;
            String nome = "Lucas José";

            System.out.println("""
                ***************************************
                Nome do dono da conta: %s
                Tipo de conta: Corrente
                Saldo atual: %.2f
                ***************************************
                """.formatted(nome, saldoTotal));
            do {
                System.out.println("""
                Opção 1: Depositar
                Opção 2: Sacar
                Opção 3: Ver saldo
                Opção 4: Sair
                """);
                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Quanto você deseja Depositar:");
                        deposito = leitor.nextDouble();
                        saldoTotal += deposito;
                        System.out.println("Seu saldo ficou: R$" + saldoTotal);
                        break;
                    case 2:
                        System.out.println("Quanto você deseja Sacar:");
                        saque = leitor.nextDouble();
                        if (saque <= saldoTotal) {
                            saldoTotal -= saque;
                            System.out.println("Seu saldo ficou: R$" + saldoTotal);
                        } else {
                            System.out.println("Você não tem esse dinheiro.");
                        }
                        break;
                    case 3:
                        System.out.println("Seu saldo atual é: R$" + saldoTotal);
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (opcao != 4);

            leitor.close();
        }
    }
