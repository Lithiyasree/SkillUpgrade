import java.io.Serializable;


class Patron implements Serializable{
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
