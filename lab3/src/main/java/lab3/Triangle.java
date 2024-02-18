package lab3;

import java.util.*;
public class Triangle {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.print("Ile wierszy: ");
        int rows = scan.nextInt();

        print_triangle(rows);

        scan.close();
    }

    public static void print_triangle(int N) {

        int width = 2 * N - 1;
        int[][] tab = new int[N][width];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < width; j++) {
                tab[i][j] = 0;
            }
        }

        tab[0][width / 2] = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < width - 1; j++) {
                tab[i][j] = tab[i - 1][j - 1] + tab[i - 1][j + 1];
            }
        }

        tab[N - 1][0] = 1;
        tab[N - 1][width - 1] = 1;

        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }
    }
}
