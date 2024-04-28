
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] JogoVelha = new char[3][3];
        int linha = 0, coluna = 0;

        System.out.println("Escolha os números onde cada jogador vai colocar o '0' ou 'x': ");
        System.out.println("11  12  13");
        System.out.println("21  22  23");
        System.out.println("31  32  33");
        System.out.println();

        for(int i = 0; i < 9; i++){
            if (i % 2 == 0) {
                System.out.println("Jogador 1, você inicia com o 'O', Digite a linha e a coluna a seguir: ");
                System.out.print("Digite a linha: ");
                linha = input.nextInt() - 1;
                System.out.print("Digite a coluna: ");
                coluna = input.nextInt() - 1;

                if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
                    System.out.println("linha ou coluna inválida, tente novamente!");
                    i--;
                    continue;
                }
                JogoVelha[linha][coluna] = 'O';
            }else{
                System.out.println("Jogador 2, você inicia com o 'X', Digite a linha e a coluna a seguir: ");
                System.out.print("Digite a linha: ");
                linha = input.nextInt() - 1;
                System.out.print("Digite a coluna: ");
                coluna = input.nextInt() - 1;

                if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
                    System.out.println("linha ou coluna inválida, tente novamente!");
                    i--;
                    continue;
                }
                JogoVelha[linha][coluna] = 'X';
            }
            char resultado = verificar(JogoVelha);
            if (resultado != '\0') {
                exibirJogo(JogoVelha);
                break;
            }

            exibirJogo(JogoVelha);
        }

        input.close();
    }
    public static char verificar(char[][] JogoVelha){
        for (int i = 0; i < 3; i++) {
            if (JogoVelha[i][0] == JogoVelha[i][1] && JogoVelha[i][1] == JogoVelha[i][2] && JogoVelha[i][0] != '\0') {
                if (JogoVelha[i][0] == 'O') {
                    System.out.println("Jogador 1 ganhou! Linha " + (i + 1) + " completa.");
                    return 'O';
                } else if (JogoVelha[i][0] == 'X') {
                    System.out.println("Jogador 2 ganhou! Linha " + (i + 1) + " completa.");
                    return 'X';
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (JogoVelha[0][i] == JogoVelha[1][i] && JogoVelha[1][i] == JogoVelha[2][i] && JogoVelha[0][i] != '\0') {
                if (JogoVelha[0][i] == 'O') {
                    System.out.println("Jogador 1 ganhou! Coluna " + (i + 1) + " completa.");
                    return 'O';
                } else if (JogoVelha[0][i] == 'X') {
                    System.out.println("Jogador 2 ganhou! Coluna " + (i + 1) + " completa.");
                    return 'X';
                }
            }
        }
        if (JogoVelha[0][0] == JogoVelha[1][1] && JogoVelha[1][1] == JogoVelha[2][2] && JogoVelha[0][0] != '\0') {
            if (JogoVelha[0][0] == 'O') {
                System.out.println("Jogador 1 ganhou! você completou a diagonal principal.");
                return ')';
            }else if (JogoVelha[0][0] == 'X') {
                System.out.println("Jogador 2 ganhou! você completou a diagonal principal.");
                return 'X';
            }
        }
        if (JogoVelha[0][2] == JogoVelha[1][1] && JogoVelha[1][1] == JogoVelha[2][0] && JogoVelha[0][2] != '\0') {
            if (JogoVelha[0][2] == 'O') {
                System.out.println("Jogador 1 ganhou! Diagonal secundária completa.");
                return 'O';
            } else if (JogoVelha[0][2] == 'X') {
                System.out.println("Jogador 2 ganhou! Diagonal secundária completa.");
                return 'X';
            }
        }
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (JogoVelha[i][j] == '\0') {
                    empate = false;
                    break;
                }
        }
        if (!empate) {
            break;
        }
        }
        if (empate) {
            System.out.println("Empate! O jogo terminou sem vencedor.");
            return ' ';
        }

        return '\0';
    }
    public static void exibirJogo(char[][] JogoVelha){
        System.out.println("Tabuleiro atual: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(JogoVelha[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}