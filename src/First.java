/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author PC
 */
public class First {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
/*
 check if N is odd
 check if N is even and its between 2 and 5
 check if N is even and its between 6 and 20, weired
 check if N is even and greater than 20
 constraints 1 <= N <=100
*/
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N >= 1 && N <= 100){
           if(N % 2 != 0 ){
            System.out.print("Weird");            
            }else if(N % 2 == 0 && N >= 2 && N <= 5){
               System.out.print("Not Weird");
            }else if(N % 2 == 0 && N >= 6 && N <= 20){
                System.out.print("Weird");
            }else{
                 System.out.print("Not Weird");
            }       
            
        }
        bufferedReader.close();
    }
}
