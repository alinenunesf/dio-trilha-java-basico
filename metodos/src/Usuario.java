public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("--------------------");
        System.out.println("  SMART TV FUNÇÕES  ");
        System.out.println("--------------------");

    //Volume
        System.out.println("Volume atual: " + smartTv.volume);        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume: " + smartTv.volume);

        System.out.println("--------------------");

    //Canal
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Mudando o canal...");
        System.out.println("Novo canal: " + smartTv.canal);

        System.out.println("--------------------");


    //Tv ligada/desligada
        System.out.println("TV ligada: " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status da Tv: " + smartTv.ligada);
    }
}
