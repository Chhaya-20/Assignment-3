public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        // Print the pattern
        for (int i = 1; i <= rows; i++) {
            // Print decreasing numbers on the left side
            for (int j = rows; j > i; j--) {
                System.out.print(j);
            }

            // Print asterisk in the middle
            System.out.print("*");

            // Print increasing numbers on the right side
            for (int j = i; j > 1; j--) {
                System.out.print(j - 1);
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
