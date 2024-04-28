
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] QuadradoP = new int[3][3];
        int num, linha1 = 0, linha2 = 0, linha3 = 0, coluna1 = 0, coluna2 = 0, coluna3 = 0, diagonalP = 0, diagonalS = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Digite o número: ");
                num = input.nextInt();
                QuadradoP[i][j] = num;
            }
        }

        for(int i = 0; i < 3; i++){
            linha1 += QuadradoP[0][i];
        }
        for(int i = 0; i < 3; i++){
            linha2 += QuadradoP[1][i];
        }
        for(int i = 0; i < 3; i++){
            linha3 += QuadradoP[2][i];
        }
        for(int i = 0; i < 3; i++){
            coluna1 += QuadradoP[i][0];
        }
        for(int i = 0; i < 3; i++){
            coluna2 += QuadradoP[i][1];
        }
        for(int i = 0; i < 3; i++){
            coluna3 += QuadradoP[i][2];
        }
        for(int i = 0; i < 3; i++){
            diagonalP += QuadradoP[i][i];
        }
        for(int i = 0; i < 3; i++){
            diagonalS += QuadradoP[i][2 - i];
        }

        if (linha1 == linha2 && linha2 == linha3 && linha3 == coluna1 && coluna1 == coluna2 && coluna2 == coluna3 && coluna3 == diagonalP && diagonalP == diagonalS) {
            System.out.println("É um quadrado mágico!");
        } else {
            System.out.println("Não é um quadrado mágico!");
        }
        
        input.close();
    }
}