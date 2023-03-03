import java.util.Scanner;

/*
*Desenvolva um gerador de tabuada,
* capaz de gerar a tabuada de qualquer nu1mero inteiro entre 1 a 10.
* O usua1rio deve informar de qual numero ele deseja ver a tabuada.
* A saida deve ser conforme o exemplo abaixo:
*
* Tabuada de 5:
* 5x1 = 5
* 5x2 = 10....
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada ..." );
        int tabuada = scan.nextInt();

        System.out.println("tabuada de :" + tabuada);
        for( int i=1; i <= 10;i++){
            System.out.println(tabuada + " X "+ i+ " = " +(tabuada*i));
        }
    }
}
