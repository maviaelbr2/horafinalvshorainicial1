import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo (0 a 23): ");
        int horaInicial = sc.nextInt();

        System.out.print("Digite a hora final do jogo (0 a 23): ");
        int horaFinal = sc.nextInt();

        // Validar se as horas estão dentro do intervalo permitido
        if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23) {
            System.out.println("Horas inválidas. Certifique-se de que estão no intervalo de 0 a 23.");
            return;
        }
        // Calcular a duração do jogo
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            // Se o jogo passar para o próximo dia
            duracao = 24 - horaInicial + horaFinal;
        }

        // Garantir que a duração seja no mínimo 1 hora e no máximo 24 horas
        duracao = Math.max(1, Math.min(24, duracao));

        System.out.println("A duração do jogo é de " + duracao + " horas.");

        sc.close();
    }
}
