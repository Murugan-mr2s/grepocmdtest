package app;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello world");

        Calculator calc = new Calculator();

        int sum = calc.add(10, 20, 30, 40);
        System.out.println(sum);

    }

}