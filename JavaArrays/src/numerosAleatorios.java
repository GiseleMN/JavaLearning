import java.util.Random;

/*
Faça um programa que leia 20 numeros inteiros aleatorios( entre 0 e 100)
armazene-os em um vetor. Ao final mostre os numeros e seus sucessores.
 */
public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int numerosAleatorios [] = new int[20];

        for(int i=0;i< numerosAleatorios.length;i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Números aleatórios: ");
        for (int numero:numerosAleatorios) {
            System.out.print(numero +" ");
        }
        System.out.print("\n Sucessores dos Números aleatórios: ");
        for (int numero:numerosAleatorios) {
            System.out.print((numero+1) +" ");
        }
        System.out.print("\n Antecessores dos Números aleatórios: ");
        for (int numero:numerosAleatorios) {
            System.out.print((numero-1) +" ");
        }
    }
}
