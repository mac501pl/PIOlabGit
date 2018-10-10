import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        Player p = new Player();
        boolean end = false;
        while(!end){
            int x = r.nextInt(6)+1;
            int y = p.guess();
            if(x == y){
                System.out.println(x + " = " + y);
                end = true;
            }
            else{
                System.out.println(x + " != " + y);
            }
        }
    }
}
