/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.project;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class NewProject {
    private static Object b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a");
        System.out.println("enter value of b");
        a=s.nextLine();
        b=s.nextLine();
        int i=a.length();
        System.out.println(i);
        if(a.equals(b))
        {
            System.out.println("yes");
        }
        char c=a.charAt(3);
        System.out.println(c);
        String d=a.substring(6);
        System.out.println(d);
        
        // TODO code application logic here
    }
}
