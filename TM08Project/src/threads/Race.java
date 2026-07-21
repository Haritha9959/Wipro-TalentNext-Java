package threads;

public class Race extends Thread {

    private static boolean raceOver = false;

    public Race(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (raceOver) {
                return;
            }

            System.out.println(getName() + " covered " + i + " meters");

            
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                return;
            }
        }

        if (!raceOver) {
            raceOver = true;
            System.out.println("\nWinner is : " + getName());
        }
    }
}