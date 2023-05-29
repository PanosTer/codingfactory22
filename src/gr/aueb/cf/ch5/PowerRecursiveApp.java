package gr.aueb.cf.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    public static float power(float a, float n){
        if ( n == 0){
            return 1;
        } else if (n < 0) {
            return 1 / power(a, -n);
        }

        return a * power(a, n - 1);

    }
}
