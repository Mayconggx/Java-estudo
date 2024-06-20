
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        Smarttv Smarttv = new Smarttv();

        Smarttv.diminuirVolume();
            Smarttv.diminuirVolume();
            Smarttv.diminuirVolume();
            Smarttv.aumentarVolume();
            System.out.println("Volume Atual: " + Smarttv.volume);




        System.out.println("TV Ligada ? " + Smarttv.ligada);
        System.out.println("Canal Atual ? " + Smarttv.canal);
        System.out.println("volume Atual ? " + Smarttv.volume);

        Smarttv.ligar();
        System.out.println("Novo status: TV Ligada ? " + Smarttv.ligada );

        Smarttv.desligar();
        System.out.println("Novo Status: TV Ligada? " + Smarttv.ligada );
    }
    }
