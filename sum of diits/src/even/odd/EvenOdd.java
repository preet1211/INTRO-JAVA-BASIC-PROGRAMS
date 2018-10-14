/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package even.odd;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter value of a");
        int a,b,c=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(a>0){
        
            b=a%10;
            a=a/10;
            c=c+b;
        }   
        System.out.println(" "+c);
                
        // TODO code application logic here
    }
}
