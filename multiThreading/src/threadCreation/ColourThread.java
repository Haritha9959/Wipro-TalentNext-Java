package threadCreation;

import java.util.Random;

public class ColourThread implements Runnable {

    String colours[] = { "white", "blue", "black", "green", "red", "yellow" };

    public void run() {
        Random random = new Random();

        while (true) {
            int index = random.nextInt(colours.length);
            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ColourThread obj = new ColourThread();
        Thread t = new Thread(obj);
        t.start();
    }
}