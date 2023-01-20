import java.util.Scanner;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    public void desligar(){
        ligada = false;
    }

    public void ligar(){
        ligada = true;
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Canal:");
        canal = sc.nextInt();
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}
