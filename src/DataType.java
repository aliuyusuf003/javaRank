import java.io.*;
import java.util.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class DataType {

  
     public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input

        for (int i = 1; i <= input; i++) {
            try {
                long number = scanner.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= -128 && number <= 127) System.out.println("* byte");
                if (number >= -32768 && number <= 32767) System.out.println("* short");
                if (number >= -2147483648L && number <= 2147483647L) System.out.println("* int");
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
       
        
    }
    
}
