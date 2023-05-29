package gr.aueb.cf.ch7;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s1 = "Athens Uni";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";

        lowercase = s1.toLowerCase();
        uppercase = s1.toUpperCase();
        trimmed = s1.trim();

        System.out.println("*".repeat(10));

        if (s2.isEmpty()){
            System.out.println(s2.length());
        }

        if (s2.isBlank()){
            System.out.println("Blank");
        }

    }
}
