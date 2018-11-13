import java.util.Scanner;

public class PlayerHuman extends Player {

    private final Scanner cin = new Scanner(System.in);

    public PlayerHuman(TextInput in) {
        super(in);
    }

    public PlayerHuman(TextInput in, String name) {
        //setName(name);  //brzydko, zasada DRY - don't repeat yourself
        super(in, name);    //wywołaj konstruktor klasy nadrzędnej
    }

    @Override
    public int guess() {
        System.out.print("Podaj liczbę (1 - 6): ");
        return cin.nextInt();           //ponoć brzydko ale ja nie wiem
    }
}
