package Q5_decypher;

public class decypher {
    public static void main(String[] args) {
        String code1 = "0@sn9sirppa@#?ia'jgtvryko1";

        String code2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String code3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        getMysteryNumber(code1);
        getMysteryNumber(code2);
        getMysteryNumber(code3);

    }

    public static int getMysteryNumber(String code) {
        int mysteryNumber = code.length() / 2;
        String mysteryCode = code.substring(5, mysteryNumber + 5);
        String filteredCode = mysteryCode.replace("@#?", " ");
        String mysteryMessage = new StringBuilder().append(filteredCode).reverse().toString();
        System.out.println(mysteryMessage);
        return mysteryNumber;
    }
}
