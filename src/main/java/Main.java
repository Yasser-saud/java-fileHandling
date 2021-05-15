import java.io.*;
import java.util.Scanner;

public class Main {

    public static void writeToFile (String fileName, String input) throws FileNotFoundException{
        // FileOutputStream 2nd param set append to True.
        FileOutputStream fos = new FileOutputStream(fileName, true);
        PrintWriter pw = new PrintWriter(fos);

        // write to file ⬇
        pw.println(input);
        pw.close();
    }

    public static void readFromFile (String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner in = new Scanner(fis);

        // read from file ⬇
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        //write and append to file ⬇⬇⬇
        writeToFile("hello.txt","helloWorld");

        //read from a file ⬇⬇⬇
        readFromFile("hello.txt");
    }
}