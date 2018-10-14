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
public class Mulltiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m;
        System.out.println("enter value of n");
        n=s.nextInt();
        System.out.println("enter value of m");
        m=s.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int c[][]=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               a[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(a[i][j]+" ");
              }
              System.out.println();    
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               b[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(b[i][j]+" ");
              }
              System.out.println(); 
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                c[i][j]=a[i][j]*b[i][j];
                
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        // TODO code application logic here
    }
}
