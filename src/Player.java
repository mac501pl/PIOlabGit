abstract public class Player {    //nie da się utworzyć instancji klasy (i dobrze!)

    private String name = "Domyslne";

    public Player() {
        //    this.name = "Domyslne";   //bez deklaracji i bez domyślnej wartości będzie NULL, tak ponoć źle
        //    setName("Domyslne");      //a może tak?
    }

    public Player(String name) {
        setName(name);
    }

    abstract public int guess();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {  //albo "".equals(name); ale to źle
            this.name = name;                   //ważne kolejność! najpierw sprawdzamy czy jest różne od NULL
        }                                       //nie ma else bo name już ma wartość przypisaną - domyślną
    }                                           //TODO: kontrola poprawności danych
}
