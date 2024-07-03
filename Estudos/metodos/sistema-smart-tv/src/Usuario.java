public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("A TV está ligada? " + smartTV.ligada);
        System.out.println("Em qual canal? " + smartTV.canal);
        System.out.println("Em qual volume?" + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo Status -> Em qual volume? " + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Novo Status -> Em qual volume? " + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("Novo Status -> Em qual canal? " + smartTV.canal);
    }
}
