import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Area of triangle = 1/2 * B * H
        // S = 1/2 (a+b+c)
        // root(s(s-a)(s-b)(s-c))
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the breadth and height of the triangle:");
//        int breadth = sc.nextInt();
//        int height = sc.nextInt();

//        double Area = 0.5*breadth*height;
//        System.out.println("Area of the triangle is:" + Area);
        System.out.println("Enter the value of a ,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        double s = 0.5*(a+b+c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("The area of the triangle is:"+area);


    }
}
