package Q6_POO;

public class Wilder {
    String firstname;
    boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters
    public String getName() {
        return this.firstname;
    }

    //setters
    public void setName(String name) {
        this.firstname = name;
    }

    public boolean getAwareness() {
        return this.aware;
    }

    public void setAwareness(boolean aware) {
        this.aware = aware;
    }

    //Who Am I
    public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + getName() + " je suis aware";

        } else return "Je m'appelle " + getName() + " je suis pas aware ";
    }


}


