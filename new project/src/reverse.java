
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class reverse {
    public static void main(String[] args) {
        String a,r="";
        Scanner s=new Scanner(System.in); 
        
        System.out.println("enter value of a");
        a=s.nextLine();
        int i=a.length();
        for (int j= i-1; j>=0; j--) {
             r=r+a.charAt(j);
        }
        System.out.println(r);
        
       
            
        
    }
    
}
