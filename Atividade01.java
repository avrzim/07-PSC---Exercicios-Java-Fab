
import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String[][] agenda = new String[30][24];
            int dia, h;

            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            input.nextLine();

            System.out.print("Digite a hora: ");
            h = input.nextInt();
            input.nextLine();

            if (agenda[dia][h] == null) {
                System.out.print("Digite sua tarefa: ");
                agenda[dia][h] = input.nextLine();

                System.out.print("Você escolheu essa tarefa no dia " + dia + " as " + h + " horas: " + agenda[dia][h]);
            } else{
                System.out.println("Esse horário está com uma tarefa!");
            }

            input.close();
    }
}