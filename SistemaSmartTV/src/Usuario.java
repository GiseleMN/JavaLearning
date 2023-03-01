public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Canal atual? =  " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual? =  " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.reduzirVolume();
        System.out.println("Qual volume atual?  = " + smartTv.volume);

        System.out.println("TV ligada?  = " + smartTv.ligada);
        System.out.println("Qual volume atual?  = " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status  ->  TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        ;
        System.out.println("Novo status  ->  TV ligada? " + smartTv.ligada);

    }
}
