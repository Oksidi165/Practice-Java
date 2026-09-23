public class Main {
    public static void main(String[] args) { 
        double a = 1;
        double b = 2;
        double e = 0.0001;

        while (b - a > e) {
            double c = (a + b) / 2;

            double fa = a * a * a - a - 2;
            double fc = c * c * c - c - 2;

            if (fa * fc < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        double x = (a + b) / 2;

        System.out.println("Корень: " + x);
    }
}