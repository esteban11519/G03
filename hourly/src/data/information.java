/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class information {
   
   private String matter; 
   private String professor;
   private String group;
   private ArrayList<dayAndHour> daysHours;

    public information(String matter,String professor, String group, ArrayList<dayAndHour> daysHours) {
        this.matter=matter;
        this.professor = professor;
        this.group = group;
        this.daysHours = daysHours;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ArrayList<dayAndHour> getDaysHours() {
        return daysHours;
    }

    public void setDaysHours(dayAndHour daysHours) {
        this.daysHours.add(daysHours);
    }
   
    @Override
    
    public String toString()
    {
        String aux="";
        for (int i = 0; i < this.daysHours.size(); i++) {
            aux+=this.daysHours.get(i).toString();
        }
        
        String all="Subject: "+this.matter+"\n"+"Professor: "+this.professor+"\n"
                +"Group: "+this.group+"\n"+"Days and Hours: \n"+aux;
        
        return  all;
    }
    
    public boolean equals(information obj)
    {
        return obj.matter.equals(this.matter);
    }
    
   
}
