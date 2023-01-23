import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class FalaHoras {
    public static void main(String[] args) {
        comprimenta();
    }

    public static void comprimenta(){
       if(pegaHoraAtual()>=18.00 && pegaHoraAtual()<=23.59){
            System.out.println("Boa noite!");
       }
       else if(pegaHoraAtual()>=12.00 && pegaHoraAtual()<=17.59){
            System.out.println("Boa tarde!");
       }
       else{
            System.out.println("Bom dia!");
       }
    }
    public static double pegaHoraAtual(){
        String timeColonPattern = "HH:mm"; //Cria um molde para formatar a hora
        DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern(timeColonPattern); //Envia o molda para a classe responsavel
        LocalTime colonTime = LocalTime.now();// Pega a hora atual do sistema
        String hora = timeColonFormatter.format(colonTime);// Formata a hora com o molde fornecido HH:mm
        String horaNova = hora.replace(':', '.');//Substitui o (:) por (.) -> Para transformar em Double. O metodo retorna uma nova String, por isso a nescessidade de uma variável.
        return Double.parseDouble(horaNova); //Retorna a hora em formato de Double HH.mm
    }
}
