import java.util.Locale;
import java.util.Scanner;

public class References {

    public static void main(String[] args) {


        //////////////////////////////////
        //Sample 1

        System.out.println("Sample 1");

        long varA = 1;

        System.out.println("varA = " + varA);
        somePrimitiveMethod(varA);
        System.out.println("varA again = " + varA);


        //////////////////////////////////
        //Sample 2

        System.out.println();
        System.out.println("Sample 2");

        long[] arrA = new long[]{1};

        System.out.println("arrA = " + arrayToString(arrA));
        someArrayMethod(arrA);
        System.out.println("arrA again = " + arrayToString(arrA));


        //////////////////////////////////
        //Sample 3

        System.out.println();
        System.out.println("Sample 3");

        Point pointA = new Point();
        pointA.x = 1;
        pointA.y = 1;

        System.out.println("pointA = " + pointToString(pointA));
        somePointMethod(pointA);
        System.out.println("pointA again = " + pointToString(pointA));

    }


    public static void somePrimitiveMethod(long a){
        a = 5;
        System.out.println("somePrimitiveMethod, a = " + a);
    }

    public static void someArrayMethod(long[] a){
        a[0] = 5;
        System.out.println("somePrimitiveMethod, a = " + arrayToString(a));
    }

    public static void somePointMethod(Point a){
        a.x = 5;
        a.y = 5;
        System.out.println("somePrimitiveMethod, a = " + pointToString(a));
    }



    public static String arrayToString(long[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            long item = arr[i];
            result += item;
            if(i != (arr.length-1)) result += ", ";
        }
        result +="]";
        return result;
    }


    public static String pointToString(Point p){
        return "(" + p.x + "," + p.y + ")";
    }

}


class Point {
    long x;
    long y;
}


