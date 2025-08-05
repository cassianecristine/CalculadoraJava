import java.util.Scanner;
// Importação do Scanner para entrada do usuário


public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Criando o Scanner para capturar entrada do usuário


        // solicitar número para o usuário
        System.out.print(" Digite o primeiro número: ");
        double a = scanner.nextDouble(); // para ler o primeiro número

        System.out.println(" Digite o segundo número: ");
        double b = scanner.nextDouble(); // para ler o segundo número

        //solicitar operação para o usuário
        //menu
        System.out.println();
        System.out.println("\nEscolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite o número da operação escolhida: ");

        int operacao = scanner.nextInt(); // para ler a operação escolhida


        // Operação

        switch (operacao) {
            case 1:
                System.out.println("Você escolheu soma!");
                System.out.println("Resultado: " + (a + b));
                break;

            case 2:
                System.out.println("Você escolheu subtração!");
                System.out.println("Resultado: " + (a - b));
                break;

            case 3:
                System.out.println("Você escolheu Multiplicação!");

                System.out.println("Resultado: " + (a * b));
                break;

            case 4:
                System.out.println("Você escolheu Divisão!");
                System.out.println("Resultado: " + (a / b));
                break;

            default:
                System.out.println(("Opção inválida!"));

        }
    }
}

// ------ PAREI AQUI ---- //

