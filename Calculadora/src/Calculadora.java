import java.util.Scanner;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas básicas
 * <p>
 * Note: Leia a documentação para desfrutar melhor dos recursos
 * </p>
 * 
 * @author Gisele Nisimura
 * @version 1.0
 * @since 01/03/ 2023
 */

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("O resultado da soma: " + somar);
        System.out.println("O valor da subtracao :" + subtrair);
        System.out.println("O valor da divisao :" + dividir);
        System.out.println("O valor da multiplicacao:" + multiplicar);

    }

    /**
     * Método utilizado para calcular a soma de dois números inteiros
     * 
     * @param a - primeiro parâmetro do método
     * @param b - segunda parâmetro do método
     * @return - resultado desse método é a soma de dois números inteiros
     */
    public static int somar(int a, int b) {

        return a + b;
    }

    /**
     * Método utilizado para calcular a subtração de dois números inteiros
     * 
     * @param a - primeiro parâmettro do método
     * @param b - segundo parâmettro do método
     * @return - resultado desse método é a subtração do primeiro parâmetro pelo
     *         segundo parâmetro
     */

    public static int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método utilizado para realizar a divisão de dois números
     * 
     * @param a - primeiro parâmetro do método
     * @param b - segundo parâmetro do método
     * @return - resultado desse método é a divisão do primeiro parâmetro pelo
     *         segundo parâmetro
     */
    public static int dividir(int a, int b) {
        return a / b;
    }

    /**
     * Método utilizado para realizar a multiplicação do primeiro parâmetro pelo
     * segundo parâmetro
     * 
     * @param a - primeiro parâmetro do método
     * @param b - segundo parâmetro do método
     * @return - resultado desse parâmetro será a multiplicação do primeiro
     *         parâmetro, pelo segundo parâmetro segundo parâmetro
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }

}