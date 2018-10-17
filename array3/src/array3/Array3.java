/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,x,c=0;
        System.out.println("enter value of n");
        n=s.nextInt();
        int a[]=new int[n];
        for ( i = 0; i < n; i++) {
            a[i]=s.nextInt();
            
            
        }
        System.out.println("enter num u want to search");
        x=s.nextInt();
        for ( i =0;i < n; i++) {
            System.out.println(" "+a[i]);
            if(a[i]==x)
            c++;
            
        }
        System.out.println("c"+c);
        // TODO code application logic here
    }
}
