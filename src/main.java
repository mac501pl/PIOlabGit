import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        //Player p = new Player("Janek");
        //Player p = new Player(); //konstruktor bezparametrowy
        //Player human = new PlayerHuman("Marek");
        //p.setName("Janek");


        Player player;
        if(false)
            player = new PlayerHuman();
        else
            player = new PlayerComp();

        try {
            player.setName("2Maciek");
        //} catch (IllegalArgumentException e) {//od najbardziej wyspecjalizowanego do najbardziej ogolnego wyjątku
        //    System.err.println("Błędne imię!\n" + e);
        } catch (Exception e) {
            System.err.println("Błąd!\n" + e + "\n" + player);
        }  //TODO: ogarnąć to

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
