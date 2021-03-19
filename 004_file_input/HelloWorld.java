import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        //Note imports above
        Scanner fileInput;
        try {
            fileInput = new Scanner(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (true){
            String line = fileInput.nextLine();
            if(line.isEmpty()) break;
            System.out.println("Line read: " + line);
        }
    }


}




