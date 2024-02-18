package lab2;

public class Fib {
    public static int fibbI(int N) throws RuntimeException {
        if (N < 0){
            throw new RuntimeException("nie mozna ujemnych");
        }
        if (N == 0){
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            int temp1 = 0;
            int temp2 = 1;
            int temp = 0;
            for (int i = 0; i < N-1; i++){
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }
            return temp;
        }
    }

    public static int fibbR(int N) throws RuntimeException {
        if (N < 0){
            throw new RuntimeException("nie mozna ujemnych");
        }
        if (N == 0){
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fibbR(N-2)+fibbR(N-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibbI(6));
        System.out.println(fibbR(6));
    }

}
