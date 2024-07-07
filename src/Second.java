
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
public class Second {

    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);       
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        String myString = scanner.nextLine();      
       
        scanner.close();
        System.out.println("String: "+myString);
        System.out.println("Double: "+myDouble);
        System.out.println("Int: "+myInt);
       
    }
}
