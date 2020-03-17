/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Esteban
 */
public class lectura {
    
        public String input="input.txt";
        public String repeatedSubject;
        
        public ArrayList<subject> lecSub(){
            Scanner reader;
            ArrayList<subject> lisSub=new ArrayList<>();
            String[] datos;
            try
            {
               reader=new Scanner(new FileInputStream(input));
               while(reader.hasNextLine())
               {
                   String auxData=reader.nextLine();
                   
                   // This simple code is very necessary
                   if(auxData.isEmpty())
                   {
                    reader.close();
                    return lisSub;
                   }
                        
                   

                   datos=auxData.split(";");



                   if(isNewSubjec(datos[0].trim().toLowerCase(),lisSub))
                   {
                       lisSub.add(newSubject(datos));
                   }
                   else
                   {
                       for (int i = 0; i < lisSub.size(); i++) {
                           if(lisSub.get(i).getInformation().get(0).getMatter().equals(repeatedSubject))
                           {
                               lisSub.get(i).setInformation(doInformation(datos));
                           }
                       }

                   }




               }
               reader.close();
            }   
            catch(FileNotFoundException error)
            {
                System.out.println("Àrchivo no encontrado");     
            }
            catch(ArrayIndexOutOfBoundsException error)
            {
                System.out.println("Por favor, revise que los datos estén con el forma"
                        + "to indicado");     
            }
        return lisSub;
    }
        
        
        public boolean isNewSubjec(String matter,ArrayList<subject> listSubject)
        {
            
            for(subject a:listSubject)
            {
                if(a.getInformation().get(0).getMatter().equals(matter)) 
                {
                    repeatedSubject=matter;
                    return false;
                }
            }
                    
            return true;
        }
        
        public subject newSubject(String[] data)
        {
            
            ArrayList<information> listInf=new ArrayList<>();
            listInf.add(doInformation(data));
            
           return new subject(listInf);
            
                    
        }
        
        public subject addInformtion(String[] data,subject sub)
        {
            sub.setInformation(doInformation(data));
            return sub;
        }
        
        public information doInformation(String[] data)
        {
            String name=data[0].trim().toLowerCase();
            String professor=data[1].trim();
            String group=data[2].trim().toLowerCase();
            String daysAndHours=data[3].trim().toLowerCase();
            String[] auxDayAndHour=daysAndHours.split("-");
            ArrayList<dayAndHour> listDayAndHour=new ArrayList<>();
 
            for (int i = 0; i < auxDayAndHour.length; i++) {
                ArrayList<String> listHours=new ArrayList<>();
                
                String[] arrayDayAndHour=auxDayAndHour[i].trim().split(":");
                String day=arrayDayAndHour[0].trim().toLowerCase();
                String[] arrayHours=arrayDayAndHour[1].split(",");
                
                for (int j = 0; j < arrayHours.length; j++) {
                    
                    listHours.add(arrayHours[j].trim().toLowerCase());
                }
                listDayAndHour.add(new dayAndHour(day,listHours));
            }
    
            
            return new information(name,professor,group,listDayAndHour);
            
            
        }
        
     
    
  
}
