import java.util.Scanner;

public class PlayerHuman extends Player {

    private final Scanner cin = new Scanner(System.in);

    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        //setName(name);  //brzydko, zasada DRY - don't repeat yourself
        super(name);    //wywołaj konstruktor klasy nadrzędnej
    }

    @Override
    public int guess() {
        System.out.print("Podaj liczbę (1 - 6): ");
        return cin.nextInt();
    }
}
