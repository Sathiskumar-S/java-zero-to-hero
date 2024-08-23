import java.util.Random;

public class Dice {
    public void rotateDice(){
        Random random = new Random();
        int dice1 = random.nextInt(7);
        int dice2 = random.nextInt(7);
        System.out.println("Dice one value is:"+ dice1);
        System.out.println("Dice two value is:"+ dice2);

    }
}
