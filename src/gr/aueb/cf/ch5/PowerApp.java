package gr.aueb.cf.ch5;

public class PowerApp {

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int result;

        result = pow(a, n);

        System.out.println("result: " + result);

    }

    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++){
            power *= a;
        }
        return power;
    }

}
