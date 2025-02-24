import java.util.Scanner;

public class App {

    public static int somaPares(int limite) {
        if (limite == 0) {
            return 0;
        } else if (limite % 2 == 0) {
            return limite + somaPares(limite - 1);
        } else {
            return somaPares(limite - 1);
        }
    }

    public static double somaElementos(double[] v, int i) {
        if (i < 0) {
            return 0;
        } else {
            return v[i] + somaElementos(v, i - 1);
        }
    }

    public static int contaOcorrencias(int[] v, int tamanho, int numero) {
        if (tamanho < 0) {
            return 0;
        } else if (v[tamanho] == numero) {
            return 1 + contaOcorrencias(v, tamanho - 1, numero);
        } else {
            return contaOcorrencias(v, tamanho - 1, numero);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolher uma opção!");
            System.out.println("1- Para somar todos os números pares até um limite");
            System.out.println("2- Para somar todos os números double dentro de um array");
            System.out.println("3- Para verificar quantas vezes o número repete dentro de um array");
            System.out.println("4- Sair do programa");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o limite de números pares");
                    int limite = leitor.nextInt();
                    System.out.println("Resultado: " + somaPares(limite));
                    break;

                case 2:
                    System.out.println("Digite o tamanho do vetor: ");
                    int n = leitor.nextInt();
                    double vetor[] = new double[n];
                    System.out.println("Digite os elementos do vetor: ");
                    for (int j = 0; j < n; j++) {
                        vetor[j] = leitor.nextDouble();
                    }
                    System.out.println("Resultado da soma: " + somaElementos(vetor, n - 1));
                    break;

                case 3:
                    System.out.println("Digite o tamanho do vetor: ");
                    int tamanho = leitor.nextInt();
                    int vetorInt[] = new int[tamanho];
                    System.out.println("Digite os elementos do vetor: ");
                    for (int j = 0; j < tamanho; j++) {
                        vetorInt[j] = leitor.nextInt();
                    }
                    System.out.println("Digite o número a ser contado: ");
                    int numero = leitor.nextInt();
                    System.out.println("O número " + numero + " aparece " + contaOcorrencias(vetorInt, tamanho - 1, numero) + " vezes no vetor.");
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 4);

        leitor.close();
    }
}
