import java.util.Random;
public class Player {
    private Random dye = new Random();

    public int guess(){
        return dye.nextInt(6)+1;
    }
}
