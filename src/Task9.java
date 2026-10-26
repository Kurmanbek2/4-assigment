public class Task9 {
    static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp = temp / 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}