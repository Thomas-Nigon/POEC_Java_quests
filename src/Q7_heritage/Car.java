package Q7_heritage;


public class Car extends Vehicle {
    public Car(String brand, int kilometer) {
        super(brand, kilometer);
    }

    @Override
    public String doStuff() {
        return " je suis une " + getBrand() + ", je fais TouuuDouDouDoudOOOOUuuuuOUUUU!";
    }
}

