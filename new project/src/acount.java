
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class acount {
    public static void main(String[] args) {
        String a,b;
        int k=0,i,f=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a");
        a=s.nextLine();
        b=s.nextLine();
        i=a.length();
        char t;
        for( t='a';t<='z';t++)
        {
            k=0;
          for ( int j= 0;j<i; j++) {
            if(a.charAt(j) ==t)
            {
                k++;
              }
          }
            for ( int j= 0;j<i; j++) {
            if(b.charAt(j) ==t)
            {
                f++;
              }
            }
          if(f!=k)
          {
              System.out.println("not anagram");
              break;
        }
         
    }
        if(t>'z')
        {
            System.out.println("anagram");
        }
    }
}
