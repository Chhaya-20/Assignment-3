import java.util.*;

class DecToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = 1;
        // char ch = 'A';
        for (int i = 0; i < n; i++) {
            int m = i + 1;
            for (int k = 0; k < j; k++) {
                System.out.print(m);
                m--;

            }
            j++;
            System.out.print('\n');
        }
        sc.close();
    }

}
