public class TimeMeasure {

    public static void main(String[] args) {

        System.out.println("Program started");

        long startTimestamp = System.currentTimeMillis();

        int y = f(3);
        System.out.println("y = " + y);

        long endTimestamp = System.currentTimeMillis();
        System.out.println("Time spent: " + (endTimestamp - startTimestamp) + " ms");

        System.out.println("Program finished");
    }

    public static int f(int x){
        int y = 1;
        for (int i = 0; i < 1000; i++) {
            y = (y * x) % 10;
            //System.out.println("Intermediate value " + y);
        }
        return y;
    }

}
