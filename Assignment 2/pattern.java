import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == k) {
                    System.out.print('*');

                } else {
                    System.out.print(j);

                }
            }
            System.out.println();
            k++;

        }

        sc.close();

    }

}
