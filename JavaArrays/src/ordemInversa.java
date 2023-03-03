/*
* Crie um vetor de 6 numeros interios
*  e mostre-os ne ordem inversa.
* */
public class ordemInversa {
    public static void main(String[] args) {

        int [] vetor = {5,3,-6,8,2,-1};
       System.out.print("Vetor: ");

       int count =0;
       while (count < (vetor.length)) {
           System.out.print(vetor[count] +" ");
           count++;
       }

       System.out.print("\n Vetor Inverso: ");
       for(int i = (vetor.length -1); i >= 0; i--){
           System.out.print(vetor[i] +" ");
       }
    }
}