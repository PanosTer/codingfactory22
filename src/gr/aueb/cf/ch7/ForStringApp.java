package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String a = "Athens Uni of Economics and Bus";

        for (int i = 0; i < a.length(); i++){
            System.out.print(a.substring(i, i+1));
        }

        System.out.println();

        String substring = s.substring(0, 6);

        System.out.println(substring);

        /*for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println("\u2764");

        for (char ch : s.toCharArray()){
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");

        int index = s.indexOf("o", 7); // απο που θα αρχίσει να μετράει για να βρει το ο
        int index2 = s.lastIndexOf("o"); // τελευταία θέση που βρίσκει το ο από το τέλος
        System.out.println(index);
        System.out.println(index);

        */if (s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}
