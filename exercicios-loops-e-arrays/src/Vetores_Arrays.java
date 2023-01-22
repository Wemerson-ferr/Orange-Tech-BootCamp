import java.util.Scanner;

public class Vetores_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[]{1,3,5,7,6};
        
        System.out.println("Array original:");
        for(int j=0; j<array.length;j++){
            System.out.printf("[%d]", array[j]);
        }

        System.out.println("\nArray ao contrário:");
        for(int i=array.length-1; i>=0;i--){
            System.out.printf("[%d]", array[i]);
        }
        
    }
}
