import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int count = 0;
        int kthScore = score[k - 1];

        for (int i = 0; i < n; i++) {
            if (score[i] >= kthScore && score[i] > 0) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}