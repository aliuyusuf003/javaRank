
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class StringFormatting {

    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);  
      System.out.println("================================");
        while (scanner.hasNext()) {
            String inputString = scanner.next();
            int inputInt = scanner.nextInt();

            // Format the output to match the specified format
            System.out.printf("%-15s%03d%n", inputString, inputInt);
        }
        System.out.println("================================");

        scanner.close();
    }
}
