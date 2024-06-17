package Q7_heritage;

public class Boat extends Vehicle {
    public Boat(String brand, int kilometer) {
        super(brand, kilometer);
    }

    @Override
    public String doStuff() {
        return "je suis un " + getBrand() + ", je fais PeuthPeuthPeuthPeuthPeuth";
    }
}
