
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PREETINDER SINGH
 */
public class anagram {
    public static void main(String[] args) {
        String a;
        int k=0,i;
      Scanner s=new Scanner(System.in);
        System.out.println("enter vaue of a");
     a=s.nextLine();
       i=a.length();
          for(char t='a';t<='z';t++){
                k=0;
               for ( int j= 0;j<i; j++){
                   if(a.charAt(j)==t){
                   k++;
                    }
               }
               System.out.println(+k" "+t);
                          
                     
      
                  
            }
            
        }
    }
    

