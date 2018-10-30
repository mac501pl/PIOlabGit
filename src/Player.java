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
        if (name != null && name.matches("^[a-zA-Z][a-zA-Z0-9.,_@-]{1,}$")) {    //REGEX101.com
            this.name = name;                   //przd kropką niby 2 \ powinno być ale nie trzeba chyba
            //albo "".equals(name); ale to źle
            //ważne kolejność! najpierw sprawdzamy czy jest różne od NULL
            //nie ma else bo name już ma wartość przypisaną - domyślną
        } else {
            //System.err.println("Błędne imię!!!");
            throw new IllegalArgumentException("Niepoprawne imię!"); //wywali program
        }
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " : " + name;
//        return super.toString() + " : " + name;
    }
}
