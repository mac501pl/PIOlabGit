import java.util.Scanner;

public class ConsoleInput implements TextInput {
    public String getText(){
        System.out.print("Podaj imie: ");
        Scanner cin = new Scanner(System.in);
        return cin.next();
    }
}
