import java.util.Scanner;

public class Task3 {
    static void printInvertedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            int stars = 2 * (n - i) - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}