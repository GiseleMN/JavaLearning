import java.util.Scanner;

/*
Faça um programa que peça uma note , entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continua pedindo
até que o usuário infrome um valor válido.
* */
public class nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota>10){
            System.out.println("Nota inválida! Digite novamente:");
            nota = scan.nextInt();
        }

    }
}
