import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima consoantes.
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int qntConsoantes =0;

        int count=0;
        do{
           System.out.print("Digite uma letra:");
           String letra = scan.next();
           if(!(letra.equalsIgnoreCase("a")|
                   letra.equalsIgnoreCase("e")|
                   letra.equalsIgnoreCase("i")|
                   letra.equalsIgnoreCase("o")|
                   letra.equalsIgnoreCase("u"))){
               consoantes[count] = letra;
               qntConsoantes++;
           }
           count++;

        }while(count< consoantes.length);
        for ( String consoante : consoantes ) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println(" - Quantidade de consoantes " + qntConsoantes);
        System.out.println("Quantidade de letras: "+consoantes.length);

    }
}
