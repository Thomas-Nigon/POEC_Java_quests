package Q6_POO;

public class Classroom {
    public static void main(String[] args) {
        Wilder sacha = new Wilder("sacha", true);
        Wilder thomas = new Wilder("thomas", false);
        System.out.println(sacha.whoAmI());
        System.out.println(thomas.whoAmI());
    }
}
