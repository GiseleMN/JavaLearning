import java.util.Scanner;

/*
Faça um programa que calcule o factorial de um número inteiro fornecido pelo usuário.
EX: 5 != 120 (5x4x3x2x1)
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        System.out.print(fatorial + "!=");
        for(int i =fatorial; i >=1; i--){
            multiplicacao = multiplicacao *i;
        }
        System.out.println(multiplicacao);
    }
}
