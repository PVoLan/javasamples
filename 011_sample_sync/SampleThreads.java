public class SampleThreads {

    public static int[] array = new int[10000];

    public static void main(String[] args) {

        System.out.println("Program started");

        for (int i = 0; i < 10; i++) {

            final int threadNumber = i+1;

            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    long startTimestamp = System.currentTimeMillis();
                    System.out.println("Thread started " + threadNumber);

                    doMagic();

                    System.out.println("Thread " + threadNumber + " result: " +
                            array[0] + "..." + array[array.length-1]);

                    long endTimestamp = System.currentTimeMillis();
                    System.out.println("Thread finished " + threadNumber +
                            " in " + (endTimestamp - startTimestamp) + " ms");
                }
            });

            t.start();
        }

        System.out.println("Program finished");
    }

    public static void doMagic(){
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

}
