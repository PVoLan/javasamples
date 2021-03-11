import java.util.Scanner;

class HelloWorld {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);


    /*
    Magic code tip:

    System.out.println( something ); - print something

    x = input.nextInt() - enter integer from keyboard an put into x;

    */

    ///////////////////////////////////////////////////
    //Ignore everything above this line

    System.out.println("Hello, world!");
    
    int a;
    int b;
    
    System.out.println("Enter A:");
    a = input.nextInt();
    System.out.println("Enter B:");
    b = input.nextInt();

    int c = a + b;

    System.out.println("C = " + c);

    //Ignore everything below this line
    ///////////////////////////////////////////////////


    }
}
