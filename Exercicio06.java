public class Exercicio06 {
    public static void main(String [] args){


        double celsius = 10.0;
        double fahrenheit;

        while (celsius <= 100.0) {
            fahrenheit = celsius * 1.8 + 32.0;

            System.out.printf("%.1f°C corresponde a %.1f°F\n", celsius, fahrenheit);
            celsius += 10.0;
        }
    }
}