import java.util.Scanner;

/*
* Faça um programa que peça N numeros inteiros
* calcule e mostre a quantidade de numeros pares
* e a quantidade de numeros impares
* */
public class parImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qntNumeros ;
        int numero;
        int pares =0, impares =0;


        System.out.println("Quantidade de números a serem inseridos: ");
        qntNumeros =scan.nextInt();
        System.out.println("---------------------");

        int count =0;
        do {
            System.out.println("Número:");
            numero = scan.nextInt();
            if(numero %2==0)pares++;
            else impares++;
            count++;

        }while (count < qntNumeros);
        System.out.println("Pares: "+pares);
        System.out.println("Impares: " + impares);
    }
}
