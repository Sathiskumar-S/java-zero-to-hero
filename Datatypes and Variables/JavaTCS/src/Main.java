import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog(2, "labrodor", Color.BLACK);
//        System.out.println(dog.age);
//        dog.changeColor(Color.ORANGE);
//        System.out.println(dog.dogColor);
        Dice dice = new Dice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Y to Start:");
        String input = sc.next();
        if(input.equals("y")){
            dice.rotateDice();
        } else{
            System.out.println("Invalid Input");
        }
    }
}