import java.util.Locale;
import java.util.Scanner;

public class References {

    public static void main(String[] args) {


        //////////////////////////////////
        //Sample 1

        System.out.println("Sample 1");

        long varA = 1;
        long varB = varA;

        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        varA = 2;
        varB = 3;

        System.out.println();
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);


        //////////////////////////////////
        //Sample 2

        System.out.println();
        System.out.println("Sample 2");

        long[] arrA = new long[]{1, 1, 1};
        long[] arrB = arrA;

        System.out.println("arrA = " + arrayToString(arrA));
        System.out.println("arrB = " + arrayToString(arrB));

        arrA[0] = 2;
        arrB[0] = 3;

        System.out.println();
        System.out.println("arrA = " + arrayToString(arrA));
        System.out.println("arrB = " + arrayToString(arrB));


        //////////////////////////////////
        //Sample 3

        System.out.println();
        System.out.println("Sample 3");

        Point pointA = new Point();
        pointA.x = 1;
        pointA.y = 1;

        Point pointB = pointA;

        System.out.println("pointA = " + pointToString(pointA));
        System.out.println("pointB = " + pointToString(pointB));

        pointA.x = 2;
        pointA.y = 2;

        pointB.x = 3;
        pointB.y = 3;

        System.out.println();
        System.out.println("pointA = " + pointToString(pointA));
        System.out.println("pointB = " + pointToString(pointB));

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


