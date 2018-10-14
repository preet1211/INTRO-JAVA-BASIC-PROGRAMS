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
public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m,r,t;
        System.out.println("enter value of n");
        n=s.nextInt();
        System.out.println("enter value of m");
        m=s.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter row number you want to reverse ");
        r=s.nextInt();
        r--;
        int l=m-1;
        for (int j=0; j<m/2; j++) {
            t=a[r][j];
            a[r][j]=a[r][l];
            a[r][l]=t;
            l--;
          }
        for (int i = 0; i <n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
