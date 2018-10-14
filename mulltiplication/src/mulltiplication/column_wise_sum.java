/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mulltiplication;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class column_wise_sum {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        int n,m,s;
        System.out.println("enter value of n");
        n=in.nextInt();
        System.out.println("enter value of m");
        m=in.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               a[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            s=0;
            for (int j = 0; j <m; j++) {
                System.out.print(a[i][j]+" ");
                s=s+a[i][j];
              }
              System.out.println("  "+s);    
        }
         for (int j = 0; j <m; j++) {
             s=0;
            for (int i = 0; i <n; i++) {
               s=s+a[i][j];
              }
              System.out.print(s+"  ");    
        }
    }
}
