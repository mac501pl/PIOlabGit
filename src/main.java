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


        int x, y;  //TODO: zrobić jakoś bez tych zmiennych i jakoś ładniej np: player: 5, comp: 6 PRZEGRANA
        System.out.println(player.getName());
        do {
            x = r.nextInt(6) + 1;
            y = player.guess();
            if (x == y) {
                System.out.println(x + " = " + y);
            } else {
                System.out.println(x + " != " + y);
            }
        } while (x != y);
    }
}
