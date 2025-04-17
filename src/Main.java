
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // asks for keyboard input
        System.out.println("ENTER TEAM AND SCORE. (EX HOME:AWAY|_:_) ");
        String in = input.nextLine();


        // split input into 2
        String[] Split = in.split("\\|");


        // organize display teams and scores
        String[] teams = Split[0].split(":");
        String[] scores = Split[1].split(":");


        // split teams
        String home = teams[0];
        String away = teams[1];


        // split scores
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);


        // if score 1 is greater than 2
        if (score1 > score2){
            System.out.printf("WINNER: %s", home);
        // if score 2 is greater than score 1
        }else if (score2 > score1){
            System.out.printf("WINNER: %s", away);

        }else{
            System.out.println("ITS A DRAW");
        }

    }
}