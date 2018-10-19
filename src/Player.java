import java.util.Random;

public class Player {
    private Random dye = new Random();
    private String name = "Domyslne";

    public Player() {
        //    this.name = "Domyslne";   //bez deklaracji i bez domyślnej wartości będzie NULL, tak ponoć źle
        //    setName("Domyslne");      //a może tak?
    }

    public Player(String name) {
        setName(name);
    }

    public int guess() {
        return dye.nextInt(6) + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {  //albo "".equals(name); ale to źle
            this.name = name;                   //ważne kolejność! najpierw sprawdzamy czy jest różne od NULL
        }                                       //nie ma else bo name już ma wartość przypisaną - domyślną
    }
}
