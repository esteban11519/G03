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
public class subject {
    
    
    
    private ArrayList<information> information;

    
    public subject(ArrayList<information> information) {
        this.information = information;
    }

    public ArrayList<information> getInformation() {
        return information;
    }

    public void setInformation(information information) {
        this.information.add(information);
    }
    
    @Override
    
    public String toString()
    {
        String all="";
        
        for(information a:this.information)
        {
            all+=a.toString();
        }
        
        return  all;
    }
    
    
    
}
