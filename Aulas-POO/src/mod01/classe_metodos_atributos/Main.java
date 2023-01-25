package mod01.classe_metodos_atributos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Carro meuCarro = new Carro();

        System.out.print("Digite a cor do seu carro: ");
        meuCarro.setCor(ent.nextLine());//Chamada, ou menssagem dos metodos do objeto.
        System.out.print("Digite a marca do seu carro: ");
        meuCarro.setMarca(ent.nextLine());//Chamada, ou menssagem dos metodos do objeto.
        System.out.print("Digite a capacidade do tanque: ");
        meuCarro.setCapacidadeTanque(ent.nextInt());//Chamada, ou menssagem dos metodos do objeto.
        System.out.print("Digite o valor da gasolina: ");
        Double precoGasolina = ent.nextDouble();
        System.out.println("Encher o tanque custará "+meuCarro.encherTanque(precoGasolina));//Chamada, ou menssagem dos metodos do objeto.
        ent.close();
    }
}
