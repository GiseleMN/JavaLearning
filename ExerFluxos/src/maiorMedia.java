/*
* Faça um programa que leia 5 números e informe o maior número
* e a média desses números
* */

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media=0;
        int count = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            media = media +numero;
            if(numero > maior)maior =numero;
            count++;

        }while (count < 5);
        System.out.println("o Maior número é: " + maior);
        System.out.println("Media é: " + media/5);




    }
}
