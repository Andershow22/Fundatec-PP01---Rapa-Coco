import java.util.Scanner;

public class App {

    public static boolean atingiuLimiteClientes(int clientesCadastrados) {
        if (clientesCadastrados > 4) {
            System.out.println("Atingiu limite de clientes!");
            return true;
        }
        return false;
    }

    public static void listagemClientes(String[] clientes, String[] corte, String[] barba, String[] barbeiro,
            double[] preco, int i) {
        for (int n = 0; n < i; n++) {
            System.out.println("============================");
            System.out.println("  Nome: " + clientes[n]);
            System.out.println("  Corte: " + corte[n]);
            System.out.println("  Barba: " + barba[n]);
            System.out.println("  Barbeiro escolhido:" + barbeiro[n]);
            System.out.println("  Valor total: " + preco[n]);
            System.out.println("============================");
            System.out.println(""); // Pular Linha
        }
    }

    public static String escolheBarbeiro(int opBarbeiro) {
        if (opBarbeiro == 0) {
            return "Tesla";
        } else if (opBarbeiro == 1) {
            return "Pitágoras";
        } else if (opBarbeiro == 2) {
            return "Aristóteles";
        } else if (opBarbeiro == 3) {
            return "Newton";
        } else if (opBarbeiro == 4) {
            return "Pascal";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        double preco[] = new double[5];
        int opcao = 4, i = 0;
        String clientes[] = new String[5];
        String barbeiro[] = new String[5];
        String corte[] = new String[5];
        String barba[] = new String[5];

        // apresentação
        System.out.println("==================================");
        System.out.println(" Bem vindo a barberia raspa coco!");
        System.out.println("==================================");
        System.out.println(""); // só pra pular uma linha
        while (opcao != 0) {
            // menu
            System.out.println("-------------MENU----------------");
            System.out.println("[1] Iniciar Atendimento");
            System.out.println("[2] Consulta do último cliente");
            System.out.println("[3] Consulta de Preços");
            System.out.println("[0] SAIR");
            System.out.println("---------------------------------");
            System.out.print("|:");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) {
                if (atingiuLimiteClientes(i)) { // valida se ainda pode cadastrar mais clientes
                } else {
                    // Atendimento
                    System.out.println("Por favor, digite seu nome.");
                    System.out.print("|:");
                    clientes[i] = sc.nextLine();

                    System.out.println("--------------------Escolha o seu barbeiro-----------------------");
                    System.out.println("[0] Tesla");
                    System.out.println("[1] Pitágoras");
                    System.out.println("[2] Aristóteles");
                    System.out.println("[3] Newton");
                    System.out.println("[4] Pascal");
                    int opBarbeiro = sc.nextInt();
                    barbeiro[i] = escolheBarbeiro(opBarbeiro);

                    // Escolha de corte
                    System.out.println("--------------Escolha seu corte----------------");
                    System.out.println("1-JITFADE   2-MULLET   3-LOWFADE");
                    System.out.println("[1] JitFade");
                    System.out.println("[2] Mullet");
                    System.out.println("[3] LowFade");
                    System.out.print("|:");
                    int opCorte = sc.nextInt();
                    sc.nextLine();
                    if (opCorte == 1) {
                        preco[i] = 30;
                        corte[i] = "JitFade";
                        System.out.println("Você escolheu um JitFade");
                    } else if (opCorte == 2) {
                        preco[i] = 40;
                        corte[i] = "Mullet";
                        System.out.println("Você escolheu um Mullet");
                    } else if (opCorte == 3) {
                        preco[i] = 35;
                        corte[i] = "Lowfade";
                        System.out.println("Você escolheu um LowFade");
                    }
                    System.out.println("você deseja fazer a barba também? [S/N]");
                    System.out.print("|:");
                    String opBarba = sc.nextLine();
                    if (opBarba.equals("S")) {
                        preco[i] = preco[i] + 10;
                        barba[i] = "Barba pra fazer";
                    } else {
                        barba[i] = "Sem barba";
                    }
                    i++;
                }
            } else if (opcao == 2) {
                if (i == 0) {
                    System.out.println("Nenhum cliente encontrado!");
                } else {
                    listagemClientes(clientes, corte, barba, barbeiro, preco, i);
                }
            } else if (opcao == 3) {
                System.out.println("Tabela de preços:");
                System.out.println("JitFade");
                System.out.println("Preço: 30R$");
                System.out.println("Lowfade");
                System.out.println("Preço: 35R$");
                System.out.println("Mullet");
                System.out.println("Preço: 40R$");
                System.out.println("Adicional barba: 10R$");
            } else if (opcao == 0) {
                System.out.println("Fim do programa.");
                break;
            } else {
                System.out.println("==========================");
                System.out.println("     Opção inexistente    ");
                System.out.println("==========================");
                System.out.println(); // pular linha
            }
        }
        // System.out.println("O valor total do seu corte: R$ " + preco);
    }

}
