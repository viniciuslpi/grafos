import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        showDialogs();
    }

    public static void showDialogs(){
        int answer = showOptions();
        do {
            if(answer == 1) Run.programPrimary();
            else Run.programSecondary();
            answer = showOptions();
        } while(answer != 0);
    }

    public static int showOptions() {
        Scanner input = new Scanner(System.in);
        System.out.println(">>> Matrizes ");
        System.out.println("1 - Primeira Matriz\n2 - Segunda Matriz\n0 - Sair");
        return input.nextInt();
    }
}


