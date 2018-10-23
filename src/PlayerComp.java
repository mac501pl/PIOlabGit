import java.util.Random;

public class PlayerComp extends Player {
    private final Random dye = new Random();

    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return dye.nextInt(6) + 1;
    }


}
