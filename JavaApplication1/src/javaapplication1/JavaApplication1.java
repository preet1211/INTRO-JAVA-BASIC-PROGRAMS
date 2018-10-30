/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author PREETINDER SINGH
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter value of a");
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("enter value of b");
        int b;
        b=s.nextInt();
        System.out.println("enter value of c");
        int c;
        c=s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a="+a);
            
        }
        else if(b>a && b>c)
                
        {
            System.out.println("b="+b);
        }
        
        else
        {
            System.out.println("c="+c);
        
    }
}}
