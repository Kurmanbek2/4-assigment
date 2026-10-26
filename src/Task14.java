import java.util.Scanner;

public class Task14 {
    static String transformDigits(long n) {
        String s = Long.toString(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            if (d % 2 == 0) {
                d++;
            } else {
                d--;
            }
            result.append(d);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(transformDigits(n));
    }
}