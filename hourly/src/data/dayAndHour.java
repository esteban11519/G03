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
public class dayAndHour {
    private String day;
    private ArrayList<String> hours;

    public dayAndHour(String day, ArrayList<String> hours) {
        this.day = day;
        this.hours = hours;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ArrayList<String> getHours() {
        return hours;
    }

    public void setHours(ArrayList<String> hours) {
        this.hours = hours;
    }
    
    @Override
    
    public String toString()
    {
        String aux="";
        for (int i = 0; i < this.hours.size(); i++) {
            aux+="\n"+this.hours.get(i);
        }
        
        String all="Day: "+this.day+"\n"+"Hours: "+aux+"\n";
        
        return  all;
    }
    
}
