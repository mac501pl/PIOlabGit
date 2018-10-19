import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        Player p = new Player("Janek");
//        Player p = new Player();

        //p.setName("Janek");
        int x, y;
        System.out.println(p.getName());
        do {
            x = r.nextInt(6) + 1;
            y = p.guess();
            if (x == y) {
                System.out.println(x + " = " + y);
            } else {
                System.out.println(x + " != " + y);
            }
        } while (x != y);
    }
}
