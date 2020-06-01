package zachet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int q = s.nextInt();
        int arr[][] = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < q; i++) {
            for (int j = p - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
