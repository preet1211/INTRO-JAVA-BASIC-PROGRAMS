/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array.reverse;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class ArrayReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter value of n");
        n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
           a[i]=s.nextInt();
            
        }
        System.out.println("reverse");
        for (int i =n-1; i >=0; i--) {
            System.out.println(" "+a[i]);
            
        }
        
        // TODO code application logic here
    }
}
