import java.awt.*;

public class Dog {
    int age;
    String type;
    Color dogColor;

    public Dog(int inputAge, String inputType,Color inputDogColor){
        this.age = inputAge;
        this.type = inputType;
        this.dogColor = inputDogColor;
    }

    public void changeAge(int newAge){
        this.age = newAge;
    }

    public void changeType(String newType){
        this.type = newType;
    }

    public void changeColor(Color newColor){
        this.dogColor = newColor;
    }
}
