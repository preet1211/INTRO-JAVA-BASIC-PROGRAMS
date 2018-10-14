/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.of.odd.numbers;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class SumOfOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter a");
        int a,b,c=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(a>0)
        {
            b=a%10;
        if(a%2!=0)
        {
            c=c+b;
        }
        a=a/10;
        }
        System.out.println(" "+c);
        }
        }
        // TODO code application logic here
    }
}
