import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        //ax+bx+c=0 => (x+r1)(x+r2) = 0
        // r1 = -b+root(b*b - 4ac)/2a
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double r1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2* a;
        double r2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2* a;

        System.out.println("Roots of Quadratic equation is:"+r1 +" "+r2);

    }
}
