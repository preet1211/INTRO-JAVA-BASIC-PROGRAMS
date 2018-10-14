
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m,sum;
        System.out.println("enter value of n");
        n=s.nextInt();
        System.out.println("enter value of m");
        m=s.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                a[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i <n; i++) {
            sum=0;
            for (int j = 0; j <m; j++) {
                System.out.println(a[i][j]+" ");
                sum=sum+a[i][j];
            }
            System.out.println("   "+s);
        }
        for (int j = 0; j<m; j++) {
            sum=0;
            for (int i = 0; i <n; i++) {
           sum=sum+a[i][j];     
            }
            System.out.println(s+"  ");
        }
    }
    
}
