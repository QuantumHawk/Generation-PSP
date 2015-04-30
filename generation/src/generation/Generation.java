/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generation;
import generation.numbersKey;
import static generation.numbersKey.random;
import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;
/**
 *
 * @author Василий
 */
public class Generation {
    int x;       
//       x=(Math.random()<0.5)?0:1
//  public String binNumber() {
//    Random rg = new Random();
//    int n = rg.nextInt(7);
//    return Integer.toBinaryString(n);
//}
    public static void main(String[] args) {
     int a,b = 0;
             numbersKey mr = new numbersKey();
     String s = "";
//        System.out.println("Введите число\n");
//        long num = scan.nextLong();
           long num = random(b);                 
        /** проверить простое **/
        boolean prime = mr.isPrime(num, 100);
        while (!prime){
         break;
        }
     String key = Integer.toBinaryString((int) num);
     Scanner scan = new Scanner(System.in);   
     StringBuilder str =  new StringBuilder();    
     a = 32768 + (int)(Math.random() * ((65535-32768) + 1));    
     for (int i=0; i<7;i++){
         b = (a << 1); 
         s = Integer.toBinaryString(b);
         s = s.substring(1, s.length());
         int decimal = Integer.parseInt(s,2);
         int Key = (int)num ^ decimal;   
         String k = Integer.toBinaryString(Key);  
         str.append(k);
         a=decimal;
         i=i+1;
     }
   String mm =  str.toString();

     
     System.out.println(str);
     System.out.println(java.util.Arrays.toString(mm.split("(?<=\\G.{16})")
  ));
//     System.out.println(Integer.toBinaryString(a));
//     System.out.println(Integer.toBinaryString(b)); 
//     System.out.println(decimal);
//     System.out.println(Integer.toBinaryString(decimal));
//     System.out.println("\n"+ num +" простое");
//     System.out.println(key);
//     System.out.println(Key);
//     System.out.println(Integer.toBinaryString(Key));
        

    }

}
