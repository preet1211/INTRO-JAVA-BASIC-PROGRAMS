/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array.del;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class ArrayDel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n,p;
        System.out.println("enter value of n");
        n=s.nextInt();
        int a[]=new int [n];
        for ( i=0;i <n;i++) {
          a[i]=s.nextInt();  
        }
        System.out.println("enter position u want to del");
        p=s.nextInt();
        p--;
        for (i=p;i<n-1;i++) {
           a[i]=a[i+1];
      }
        for( i=0;i<n-1;i++) {
            System.out.println(" "+a[i]);
            
        }
        
        // TODO code application logic here
    }
}
