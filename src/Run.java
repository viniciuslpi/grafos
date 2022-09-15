import java.util.Scanner;

public class Run {
    public static void programPrimary() {
        Scanner scan = new Scanner(System.in);
        Matriz matriz = new Matriz();
        int answer;

        System.out.println("Informe o tamanho da matriz (n x m): ");
        int matrizLength = scan.nextInt();
        matriz.matriz = new int[matrizLength][matrizLength];

        do {
            System.out.println("Digite a entrada do vértice: ");
            int num1 = scan.nextInt();
            System.out.println("Digite a saída do vértice: ");
            int num2 = scan.nextInt();

            matriz.insertValuePrimaryMatriz(num1, num2);
            matriz.show();

            System.out.println("\nDeseja continuar? (1 - Continuar | 0 - Encerrar)");
            answer = scan.nextInt();
        } while(answer == 1);
    }

    public static void programSecondary() {
        Scanner scan    = new Scanner(System.in);
        Matriz matriz   = new Matriz();
        int answer;

        System.out.println("Informe o número de linhas da matriz: ");
        int matrizLines    = scan.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int matrizColumns   = scan.nextInt();
        matriz.matriz       = new int[matrizLines][matrizColumns];

        do {
            System.out.println("Informe o vértice de entrada: ");
            int inputPosition   = scan.nextInt();
            System.out.println("Informe o vértice de saída: ");
            int outputPosition  = scan.nextInt();

            matriz.insertValueSecondaryMatriz(inputPosition, outputPosition);
            matriz.show();
            System.out.println("\nDeseja continuar? (1 - Continuar | 0 - Encerrar)");
            answer = scan.nextInt();
        } while(answer == 1);


    }
}
