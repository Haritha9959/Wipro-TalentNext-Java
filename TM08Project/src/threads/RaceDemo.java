package threads;

public class RaceDemo {

    public static void main(String[] args) {

        Race hare = new Race("Hare");
        Race tortoise = new Race("Tortoise");

        
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}