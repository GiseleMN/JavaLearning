public class operadores {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 =false;

        System.out.println(" b1 && b2 " + ( b1 && b2) );
        System.out.println(" b1 && b3 " + ( b1 && b3) );
        System.out.println("-------------------------");

        System.out.println(" b2 || b3 " + ( b2 || b3) );
        System.out.println(" b2 || b4 " + ( b2 || b4) );
        System.out.println("-------------------------");

        System.out.println(" b1 ^ b3 " + ( b1 ^ b3) );
        System.out.println(" b4 ^ b3 " + ( b4 ^ b3) );
        System.out.println("-------------------------");

        System.out.println(! b1 );
        System.out.println(! b2 );
        System.out.println("-------------------------");

        int a = 10;
        int b = 5;
        float fa =20f;
        float fb = 50f;

        System.out.println(" (( a + b ) < ( fb - fa)) && true " + (((a+b)<(fb-fa))&&true  ) );
        System.out.println("(a > b)|| (fb < fa) " + ( (a>b)|| (fb <fa)) );
        System.out.println("-------------------------");

        // boas práticas em códigos, fazendo reuso. Ex:
       // double salarioMensal = 11983.58d;
        double salarioMensal = 5089.75d;
        double mediaSalarial = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal< mediaSalarial) && (quantidadeDependentes>= mediaDependentes));

        boolean salarioBaixo = salarioMensal< mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo)&&(muitosDependentes));

        boolean receberAuxilio = (salarioBaixo)&&(muitosDependentes);
        System.out.println( "Receber auxílio : " + receberAuxilio);

    }
}
