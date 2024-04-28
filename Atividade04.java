
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matriz = new double[4][4];
        double num;

        System.out.println("A matriz irá seguir a seguinte ordem: ");
        System.out.println("1  2  3  4");
        System.out.println("5  6  7  8");
        System.out.println("9 10  11 12");
        System.out.println("13 14 15 16");
        System.out.println();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite os números da matriz a seguir: ");
                num = input.nextDouble(); 

                matriz[i][j] = num;
            }   
        }
        System.out.println("Diagonal principal: ");
        valorPrincipal(matriz);
        System.out.println();
        System.out.println("Diagonal secundária: ");
        valorSecundario(matriz);
        System.out.println();
        System.out.println("Matriz Transposta:");
        exibirTransposta(matriz);

        input.close();
    }
    public static void valorPrincipal(double matriz[][]){

        for(int i = 0; i < 4; i ++){
            System.out.print(matriz[i][i] + " ");
        }

    }
    public static void valorSecundario(double matriz[][]){
        for(int i = 0; i < 4; i++) {
            System.out.print(matriz[3 - i][i] + " ");
        }
    }
    public static void exibirTransposta(double matriz[][]) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}