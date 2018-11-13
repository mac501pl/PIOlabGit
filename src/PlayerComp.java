import java.util.Random;

public class PlayerComp extends Player {
    private final Random dye = new Random();

    public PlayerComp(TextInput in) {
        super(in);
    }

    public PlayerComp(TextInput in, String name) {
        super(in, name);
    }

    @Override
    public int guess() {
        return dye.nextInt(6) + 1;
    }


}
