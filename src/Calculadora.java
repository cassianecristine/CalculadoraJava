import java.util.Scanner;
// Importação do Scanner para entrada do usuário


public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// Criando o Scanner para capturar entrada do usuário


        // solicitar número para o usuário
        System.out.print(" Digite o primeiro número: ");
        double a = scanner.nextDouble(); // para ler o primeiro número

        System.out.println(" Digite o segundo número: ");
        double b = scanner.nextDouble(); // para ler o segundo número

        //solicitar operação para o usuário
        System.out.println("\nEscolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite o número da operação escolhida: ");

        double operacao = scanner.nextDouble(); // para ler a operação escolhida

        // Operação escolhida
        double resultado = 0;
                boolean operacaoValida = true; // Variável para verificar se é valido

        // ------ PAREI AQUI ---- //

        // Escolher operação com base na entrada do usuário

        //Soma, subtração, multiplicação e divisão


        // Chamando os métodos e armazenando os resultados
        double resultadoSoma = somar(a ,b );
        double resultadoSubtracao = subtrair(a, b);
        double resultadoMultiplicacao = multiplicar(a , b);
        double resultadoDivisao = dividir(a, b); // tem que tratar a divisão por zero

        // Exibir os resultados
        System.out.println("\nResultados: ");
        System.out.println(" Soma: " + resultadoSoma);
        System.out.println(" Subtração: " + resultadoSubtracao);
        System.out.println(" Multiplicação: " + resultadoMultiplicacao);
        System.out.println(" Divisão: " + resultadoDivisao);

        scanner.close(); //Precisa ser fechado o scanner
    }

    //Metodos para soma, subtração, multiplicação e divisão
    public  static double somar(double a, double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double dividir(double a , double b) {
        if (b == 0){
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a/b;
    }
}
