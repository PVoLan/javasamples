public class SampleThreads {

    public static void main(String[] args) {

        System.out.println("Program started");

        for (int i = 0; i < 10; i++) {
            final int threadNumber = i+1;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTimestamp = System.currentTimeMillis();
                    System.out.println("Thread started " + threadNumber);
                    f(7);

                    long endTimestamp = System.currentTimeMillis();
                    System.out.println("Thread finished " + threadNumber +
                            " in " + (endTimestamp - startTimestamp) + " ms");
                }
            });
            t.start();
        }

        System.out.println("Program finished");
    }

    public static int f(int x){
        int y = 1;
        for (int i = 0; i < 1000; i++) {
            y = (y * x) % 10;
        }
        return y;
    }

}
