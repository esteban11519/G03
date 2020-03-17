/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import GUI.viuw;
import data.lectura;

/**
 *
 @author Esteban
 */



public class hourly
{
    public static void main(String[] args) {

    lectura lect=new lectura();    
    viuw.view(lect.lecSub());
    
//    This code is to do some test 

//    comparisons comp= new comparisons();
//    viuw.viuwPrint(comp.subject4(lect.lecSub()), lect.lecSub().size());


//    //tree options
//    lectura lect=new lectura();    
//    comparisons comp= new comparisons();
//    viuw.viuwPrint(comp.subject3(lect.lecSub().get(1), lect.lecSub().get(2),
//            lect.lecSub().get(3)), 3);
     

        
//    //two options
//    lectura lect=new lectura();    
//    comparisons comp= new comparisons();
//    viuw.viuwPrint(comp.subject2(lect.lecSub().get(1), lect.lecSub().get(3)), 2);
//     
        
//        //All the information
//        lectura lect=new lectura();
//        
//        for(subject a:lect.lecSub())
//        {
//            System.out.println(a);
//        }

        
            
    }
}