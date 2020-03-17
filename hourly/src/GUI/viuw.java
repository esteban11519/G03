/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import business.comparisons;
import data.information;
import data.subject;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class viuw {
 
    public static void viuwPrint(ArrayList<information> lisInf,int n)
    {
        int a=0;
        int b=1;

        for(information i:lisInf)
        {
            if(a%n==0)
            {
                
            System.out.println("\n"+"Option "+Integer.toString(b++)+"\n");

            }
            System.out.println(i);
            a++;
        }
    }
    
    public static void view (ArrayList<subject> lisSub)
    {
     int n=lisSub.size();
         comparisons comp= new comparisons();
         switch(n)
         {
             case 2:
             {
                 viuw.viuwPrint(comp.subject2(lisSub), n);
                 break;
             }
             case 3:
             {
                 viuw.viuwPrint(comp.subject3(lisSub), n);
                 break;
             }
             case 4:
             {
                 viuw.viuwPrint(comp.subject4(lisSub), n);
                 break;
             }
             case 5:{
                 viuw.viuwPrint(comp.subject5(lisSub), n);
                 break;
             }
             case 6:{
                 viuw.viuwPrint(comp.subject6(lisSub), n);
                 break;
             }
             case 7:{
                 viuw.viuwPrint(comp.subject7(lisSub), n);
                 break;
             }
             default:
             {
                 System.out.println("Not is possible do the operation, on"
                         + "ly from 2 to 7 subjects");
             }

         }
     
     
        
    }
   
    
   
}
