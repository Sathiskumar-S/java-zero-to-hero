import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // volume = length * breadth * height
        // Area = 2*((length*breadth)+(breadth*height)+(length*breadth));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length breadth height:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();

        int volume = length * breadth * height;
        int area = 2*((length*breadth)+(breadth*length)+(length*breadth));

        System.out.println("The volume of the cuboid is:"+volume);
        System.out.println("The area of the cuboid is:"+area);
    }
}
