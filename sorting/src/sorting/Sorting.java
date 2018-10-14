/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter value of n");
        n=s.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++) {
            System.out.print("enter "+(i+1)+"value...");
            a[i]=s.nextInt();
      }
        Arrays.sort(a);
        for (int i = n-1; i>=0; i--) {
            System.out.println(a[i]);
            
        }
        // TODO code application logic here
    }
}
