import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        double preco = 0;
        String nome = "", barba = "", corte = "";
        int opcao = 4, opCorte;
        String barbeiro[] = {"Tesla", "Pitágoras", "Aristóteles"};

        // apresentação
        System.out.println("==================================");
        System.out.println(" Bem vindo a barberia raspa coco!");
        System.out.println("==================================");
        System.out.println(""); // só pra pular uma linha
        while (opcao != 0) {
            // menu
            System.out.println("-------------MENU----------------");
            System.out.println("[1] Iniciar Atendimdento");
            System.out.println("[2] Consulta do último cliente");
            System.out.println("[3] Consulta de Preços");
            System.out.println("[0] SAIR");
            System.out.println("---------------------------------");
            System.out.print("|:");
            opcao = sc.nextInt();
            sc.nextLine();
                if (opcao == 1) {
                // Cadastro de cliente
                System.out.println("Por favor, digite seu nome.");
                System.out.print("|:");
                nome = sc.nextLine();

                preco = 0; //reseta valor de preço afim de impedir acumulo
                // Escolha de corte
                System.out.println("--------------Escolha seu corte----------------");
                System.out.println("1-JITFADE   2-MULLET   3-LOWFADE");
                System.out.println("[1] JitFade");
                System.out.println("[2] Mullet");
                System.out.println("[3] LowFade");
                System.out.print("|:");
                opCorte = sc.nextInt();
                sc.nextLine();
                if (opCorte == 1) {
                    preco = 30;
                    corte = "JitFade";
                    System.out.println("Você escolheu um JitFade, preço de: " + preco);
                } else if (opCorte == 3) {
                    preco = 35;
                    System.out.println("Você escolheu um LowFade, preço de: " + preco);
                    corte = "LowFade";
                } else if (opCorte == 2) {
                    corte = "Mullet";
                    preco = 40;
                    System.out.println("Você escolheu um Mullet, preço de: " + preco);
                }
                // 3° Regra, barba.
                System.out.println("você deseja fazer a barba também? [S/N]");
                System.out.print("|:");
                barba = sc.nextLine();
                if (barba.equals("S")) {
                    preco = preco + 10;
                    barba = "Barba pra fazer";
                } else {
                    barba = "Sem barba";
                }
            } else if (opcao == 2) {
                if (nome.isEmpty() == true || corte.isEmpty() == true) {
                    System.out.println("Nenhum corte ou usuário encontrado!");
                } else {
                    // 3° regra, consulta cliente
                    System.out.println("============================");
                    System.out.println("  Nome: " + nome);
                    System.out.println("  Corte: " + corte);
                    System.out.println("  Barba: " + barba);
                    System.out.println("  Valor total: " + preco);
                    System.out.println("============================");
                    System.out.println(""); // Pular Linha
                }
            }else if(opcao == 3){
                System.out.println("Tabela de preços:");
                System.out.println("JitFade");
                System.out.println("Preço: 30R$");
                System.out.println("Lowfade");
                System.out.println("Preço: 35R$");
                System.out.println("Mullet");
                System.out.println("Preço: 40R$");
                System.out.println("Adicional barba: 10R$");
            }
            else if(opcao == 0){
                System.out.println("Fim do programa.");
            }
        }
        // System.out.println("O valor total do seu corte: R$ " + preco);
    }

}
