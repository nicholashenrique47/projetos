import java.util.Scanner;

public class VotacaoSindico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos candidatos deseja cadastrar? ");
        int qtdCandidatos = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qtdCandidatos];
        int[] numeros = new int[qtdCandidatos];
        int[] votos = new int[qtdCandidatos];

        for (int i = 0; i < qtdCandidatos; i++) {
            System.out.println("\nCadastro do candidato " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Número: ");
            numeros[i] = sc.nextInt();
            sc.nextLine();
            votos[i] = 0; // inicia sem votos
        }

        System.out.print("\nQuantos eleitores irão votar? ");
        int qtdEleitores = sc.nextInt();

        for (int i = 0; i < qtdEleitores; i++) {
            System.out.println("\nEleitor " + (i + 1) + " - Escolha seu candidato:");
            for (int j = 0; j < qtdCandidatos; j++) {
                System.out.println(numeros[j] + " - " + nomes[j]);
            }

            int voto;
            boolean votoValido;
            do {
                System.out.print("Digite o número do candidato: ");
                voto = sc.nextInt();
                votoValido = false;

                for (int j = 0; j < qtdCandidatos; j++) {
                    if (numeros[j] == voto) {
                        votos[j]++;
                        votoValido = true;
                        break;
                    }
                }

                if (!votoValido) {
                    System.out.println("Número inválido! Digite novamente.");
                }
            } while (!votoValido);
        }

        int totalVotos = 0;
        for (int v : votos) {
            totalVotos += v;
        }

        for (int i = 0; i < qtdCandidatos - 1; i++) {
            for (int j = 0; j < qtdCandidatos - i - 1; j++) {
                if (votos[j] < votos[j + 1]) {
                    int tempV = votos[j];
                    votos[j] = votos[j + 1];
                    votos[j + 1] = tempV;

                    int tempN = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tempN;

                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }

        System.out.println("\n--- Resultado Final ---");
        for (int i = 0; i < qtdCandidatos; i++) {
            double perc = (totalVotos == 0) ? 0 : (votos[i] * 100.0 / totalVotos);
            System.out.printf("%s (%d) - %d votos (%.2f%%)%n", nomes[i], numeros[i], votos[i], perc);
        }

        if (qtdCandidatos > 0) {
            double percVencedor = (totalVotos == 0) ? 0 : (votos[0] * 100.0 / totalVotos);
            System.out.printf("\nVencedor: %s (%d) com %.2f%% dos votos.%n", nomes[0], numeros[0], percVencedor);
        }

        sc.close();
    }
}
