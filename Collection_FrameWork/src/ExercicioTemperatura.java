import java.util.ArrayList;
import java.util.List;

public class ExercicioTemperatura {
    public static void main(String[] args) throws Exception {
        List<Double> temperatura = new ArrayList<>();
        temperatura.add(27.5);
        temperatura.add(26d);
        temperatura.add(18.7);
        temperatura.add(9.5);
        temperatura.add(32d);
        temperatura.add(28d);
        Double tempMedia = 0.0;
        for (Double double1 : temperatura) {
            tempMedia+=double1;
        }
        tempMedia = tempMedia/temperatura.size();
        System.out.printf("A temperatura média é %.2f\n", tempMedia);
        for(int i=0; i<temperatura.size(); i++){
            if(temperatura.get(i)>=tempMedia){
                if(i==1){
                    System.out.println("Janeiro teve temperatura em cima da média com "+temperatura.get(i));
                }
                else if(i==2){
                    System.out.println("Fevereiro teve temperatura em cima da média com "+temperatura.get(i));
                }
                else if(i==3){
                    System.out.println("Março teve temperatura em cima da média com "+temperatura.get(i));
                }
                else if(i==4){
                    System.out.println("Abril teve temperatura em cima da média com "+temperatura.get(i));
                }
                else if(i==5){
                    System.out.println("Maio teve temperatura em cima da média com "+temperatura.get(i));
                }
                else if(i==6){
                    System.out.println("Junho teve temperatura em cima da média com "+temperatura.get(i));
                }
            }
        }
    }
}
