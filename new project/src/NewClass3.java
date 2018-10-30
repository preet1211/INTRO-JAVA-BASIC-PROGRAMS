
import java.util.Random;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class NewClass3 {
    public static void main(String[] args) {
        String a,c,e;
        Random r=new Random();
        int i=r.nextInt(6)+1;
        Scanner s=new Scanner(System.in);
        a=s.nextLine();
        String b=a.substring(0,i-1)+' '+a.substring(i,a.length());
        System.out.println(b);
        char d=a.charAt(i-1);
        System.out.println("enter character");
        c=s.nextLine();
        e=d+"";
        
        if(c.equals(e))
        {
            System.out.println("You Win");
        }
        else
        {
            System.out.println("You Lose");
        }
        
    }
    
}
