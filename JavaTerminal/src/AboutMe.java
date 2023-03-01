public class AboutMe {

    public static void main(String[] args) {

        String name = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);
        double hight = Double.valueOf(args[3]);

        System.out.println("Olá eu me chamo " + name + " " + lastName);
        System.out.println("Tenho " + age + " anos ");
        System.out.println("Minha altura é de " + hight + "cm");
        // parametros recebidos ao acessar diretório bin pelo terminal

    }
}
