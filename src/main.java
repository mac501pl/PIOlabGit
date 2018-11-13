import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner cin = new Scanner(System.in);
        //Player p = new Player("Janek");
        //Player p = new Player(); //konstruktor bezparametrowy
        //Player human = new PlayerHuman("Marek");
        //p.setName("Janek");


        //TextInput in = new ConsoleInput();

        Player player;
        if(false)
            player = new PlayerHuman(new ConsoleInput());
        else
            player = new PlayerComp(new GUIInput());

        //player.setTextInput(new ConsoleInput());


        try {
    player.askForName();
        } catch (IllegalArgumentException e) {//od najbardziej wyspecjalizowanego do najbardziej ogolnego wyjątku
            System.err.println("Błędne imię!\n" + e);
        } catch (Exception e) {
            System.err.println("Błąd!\n" + "\n" + player);
        }

        int number, guess;

        do {
            System.out.println("---------------------");

            number = r.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();

            System.out.println("Gracz " + player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }

        } while (number != guess);

        System.out.println("BRAWO!");
    }
}
