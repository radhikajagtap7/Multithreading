public class NumberThread extends Thread {
    public int start;
    public int stop;
    public int delay;

    public NumberThread(int start, int stop, int delay){
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
