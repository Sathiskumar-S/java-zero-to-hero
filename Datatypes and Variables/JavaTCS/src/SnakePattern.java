public class SnakePattern {
    public static void main(String[] args) {
        int n=4, count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count + " ");
                if (i % 2 == 0 && j != n)
                    count -= 1;
                else if (i % 2 != 0 && j != n)
                    count += 1;
            }
                count += n;
                System.out.println();
        }
    }
}
