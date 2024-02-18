package lab2;

public class Printer {

    public static void print_even(int N) {
        for (int i = 0; i <= N; i+=2) {
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        print_even(420);
    }

}
