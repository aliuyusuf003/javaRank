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
public class querySeries {

  
     public static void main(String[] args) throws IOException {
         /*
         Explanation
Scanner Initialization: The Scanner object reads input from the console.
Number of Queries: int q = scanner.nextInt(); reads the number of queries.
Loop through Queries:
For each query, read a, b, and n.
Initialize currentTerm to a.
For each term in the series, update currentTerm by adding 
(2𝑗⋅𝑏)(2j ⋅b).
Print each term, followed by a space.
Print a New Line: After printing all terms of the series for a query, print a new line.
         */
         Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt(); // Number of queries
        
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            int currentTerm = a;
            for (int j = 0; j < n; j++) {
                currentTerm += (int) Math.pow(2, j) * b;
                System.out.print(currentTerm + " ");
            }
            System.out.println();
        }
        
        scanner.close();
        
    }
    
}
