
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class rev1 {
    public static void main(String[] args) {
        String a;
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a");
       a=s.nextLine();
       String b[]=a.split(" ");
       i=b.length;
        for (int j = 0; j <i; j++) {
            System.out.print(b[j].substring(1)+b[j].charAt(0)+" ");
        }
       
        
    }
}
