package Q7_heritage;

public abstract class Vehicle {

    // attributs
    private String brand;
    private int kilometer;

    // constructeurs
    public Vehicle(String brand, int kilometer) {
        this.brand = brand;
        this.kilometer = kilometer;
    }

    // accesseurs et mutateurs
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometer() {
        return this.kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public abstract String doStuff();
}
