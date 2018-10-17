/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array.insert;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class ArrayInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n,p,v;
        System.out.println("enter value of n");
        n=s.nextInt();
        int a[]=new int [n+1];
        for ( i=0;i<n;i++) {
            a[i]=s.nextInt();
         }
        System.out.println("enter position where u  want to enter");
        p=s.nextInt();
        
        System.out.println("enter new value to insert");
        v=s.nextInt();
        p--;
        for ( i=n-1;i>=p;i--) {
            a[i+1]=a[i];
        }
        a[p]=v;
        for ( i=0;i<=n;i++) {
            System.out.println(" "+a[i]);
        }
        }
        }
