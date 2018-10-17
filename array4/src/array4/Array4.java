/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array4;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class Array4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i;
        System.out.print("enter value of n");
        n=s.nextInt();
        int a[]=new int[n];
        for ( i = 0; i < n; i++) {
            a[i]=s.nextInt();
            
        }
        System.out.print("reverse");
        for ( i = n-1; i >=0;i--) {
            System.out.print(" "+a[i]);
            
        }
       
        // TODO code application logic here
    }
}
