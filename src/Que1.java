import java.util.Arrays;

public class Que1 {
    
public class Main {
    public static void main(String[] args) {
        int X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int Y[] = { 1, 8, 9, 10, 15 };
        mergeArrays(X, Y);
        System.out.println(Arrays.toString(X));
    }

    public static void mergeArrays(int[] X, int[] Y) {
        int i = X.length - 1;
        int j = Y.length - 1;
        int k = X.length - 1;

        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }

        while (j >= 0) {
            X[k--] = Y[j--];
        }
    }
}

}
