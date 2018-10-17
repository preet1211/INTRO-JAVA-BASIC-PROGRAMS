/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array5;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class Array5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,sum=0,avg;
        System.out.println("enter value of n");
        n=s.nextInt();
        int a[]=new int[n];
        for ( i = 0; i < n; i++) {
            a[i]=s.nextInt();
      }
        System.out.println("avg");
        for ( i = 0; i < n; i++) {
           sum=sum+a[i];
            
        }
        avg=sum/n;
        System.out.println(" "+avg);
        
        // TODO code application logic here
    }
}
