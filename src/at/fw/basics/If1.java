package at.fw.basics;

import java.util.Random;

public class If1 {


    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("Mini");
        }
        if ((randomNumber > 20) && (randomNumber < 50)) {
            System.out.println("Medium");
        }
        if (randomNumber > 50) {
            System.out.println("Large");
        }
    }
}