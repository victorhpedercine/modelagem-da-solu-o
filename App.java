import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerDeEntrada = new Scanner(System.in);
        int tipoTarefa;
        int contadorRiscoAlto = 0;

        System.out.println("AVALIADOR DE TAREFAS PARA IA ");
        System.out.println("1 - Zona Verde (Formatar, Traduzir, Corrigir)");
        System.out.println("2 - Zona Amarela (Resumir artigos, Estruturar rascunhos)");
        System.out.println("3 - Zona Vermelha (Geração de dados, Cálculos, Análises)");
        System.out.println("0 - Sair do programa");
        System.out.println("");

        do {
            System.out.print("Digite o código da tarefa que deseja delegar à IA: ");
            tipoTarefa = scannerDeEntrada.nextInt();

            if (tipoTarefa == 1) {
                System.out.println(" ZONA VERDE: Baixo risco. Uma leitura atenta é suficiente.");
            } else if (tipoTarefa == 2) {
                System.out.println(" ZONA AMARELA: Risco médio. Aplique o pensamento crítico e reveja as fontes.");
            } else if (tipoTarefa == 3) {
                System.out.println(
                        " ZONA VERMELHA: Alto risco! A IA rascunha, mas o humano assina. Revisão humana profunda é obrigatória.");
                contadorRiscoAlto++;
            } else if (tipoTarefa != 0) {
                System.out.println(" Código inválido. Tente novamente.");
            }

        } while (tipoTarefa != 0);

        String alertaFinal = (contadorRiscoAlto > 0)
                ? "ALERTA FINAL: Você solicitou tarefas de alto risco nesta sessão. Nunca delegue o julgamento final!"
                : "Sessão encerrada. Nenhuma tarefa crítica (Zona Vermelha) foi delegada.";

        System.out.println("\n" + alertaFinal);

        scannerDeEntrada.close();
    }
}
