/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.array.pkg1;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class Array1 {

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
        int a[][]=new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                a[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            int sum=0;
            for (int j = 0; j < m; j++) {
                sum=sum+a[i][j];
                System.out.print(a[i][j]);
            }
            System.out.println(" "+sum );
        }
        for (int j = 0; j <m; j++) {
            int sum=0;
            for (int i = 0; i <n; i++) {
                sum=sum+a[j][i];
               
            }
            System.out.print(" "+sum);
        }
       
        // TODO code application logic here
    }
}
