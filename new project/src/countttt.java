
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class countttt {
    public static void main(String[] args) {
        String a;
        int k=0,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a");
        a=s.nextLine();
        i=a.length();
        for (int j = 0; j <i; j++) {
            if(a.charAt(j)=='a')
            {
                k++;
            }
            
        }
        System.out.println(" "+k);
    }
}
