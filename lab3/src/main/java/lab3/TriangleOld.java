package lab3;

import java.util.*;

public class TriangleOld {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.print("Ile wierszy: ");
        int rows = scan.nextInt();

        print_triangle(rows);

        scan.close();
    }

    public static long silnia(int N) throws RuntimeException {
        if (N < 0){
            throw new RuntimeException("nie mozna ujemnych");
        } else if (N == 1 || N == 0) {
            return 1;
        } else {
            return N*silnia(N-1);
        }
    }

    public static long wielomian_newtona(int N, int K){
        long[] test = {silnia(N), silnia(K), silnia(N-K),silnia(N)/(silnia(K)*silnia(N-K))};
        return test[3];
    }
    public static void print_triangle(int N){
        int width = 2*N+1;
        long[][] numbers = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                numbers[i][j] = 0;
            }
        }
        try {
            for (int i = 0; i < N; i++) {
                int first = 0;
                if (i%2 == 1) {
                    first = N/2 - i/2 - 1;
                } else {
                    first = N/2 - i/2;
                }
                int maxJ = i+1;
                for (int j = 0; j < maxJ; j++) {
                    numbers[i][first+j] = wielomian_newtona(i, j);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
