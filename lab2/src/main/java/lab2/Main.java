package lab2;


public class Main {
    public static void main(String[] args) {
        Printer.print_even(420);

        int n = 19;
        try {
            System.out.println(Fib.fibbI(n));

            System.out.println(Fib.fibbR(n));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }

    }
}