/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *I all the time say that all the things are posibles thanks to God, because 
 * without He, anything has heartfelt.
 * 
 * @author Esteban
 */
public class combine {
    public ArrayList<String> combine1(int a)
    {
        ArrayList<String> combinations=new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            String aux=Integer.toString(1)+","+Integer.toString(i)+",";
            combinations.add(aux);
        }
        return combinations;
    }
    
    public ArrayList<String> combine2(int a,int b)
    {
        ArrayList<String> combinations0=combine1(a);
        ArrayList<String> combinations=new ArrayList<>();
        int auxi=1;
        String auxString;
        
        for (int i = 1; i <= a*b; i++) {
            int auxIndex=i%a;
            
            auxString=Integer.toString(2)+","+Integer.toString(auxi)+",";
            

            if(auxIndex==0){
                auxString+=combinations0.get(a-1);
            }
            else
            {
                auxString+=combinations0.get(auxIndex-1);
            }
            
            combinations.add(auxString);
            if(i>=auxi*a)
            {
                auxi+=1;
            }
                
        }
        return combinations;
    }
    
    
    public ArrayList<String> combine3(int a,int b,int c)
    {
       int n=a*b*c;
       int n1=a*b;
       int col=3;
       
        ArrayList<String> combinations0=combine2(a,b);
        
        
        ArrayList<String> combinations=new ArrayList<>();
        int auxi=1;
        String auxString;

        for (int i = 1; i <=n; i++) {
            int auxIndex=i%(n1);
            
            auxString=Integer.toString(col)+","+Integer.toString(auxi)+",";
            

            if(auxIndex==0){
                auxString+=combinations0.get(n1-1);
            }
            else
            {
                auxString+=combinations0.get(auxIndex-1);
            }
            
            combinations.add(auxString);
            if(i>=auxi*n1)
            {
                auxi+=1;
            }
                
        }
        return combinations;
    }
    
    public ArrayList<String> combine4(int a,int b,int c,int d)
    {
        int n=a*b*c*d;
        int n1=a*b*c;
        int col=4;
        
        ArrayList<String> combinations0=combine3(a,b,c);
        ArrayList<String> combinations=new ArrayList<>();
        int auxi=1;
        String auxString;
        
        
        for (int i = 1; i <=n; i++) {
            int auxIndex=i%(n1);
            
            auxString=Integer.toString(col)+","+Integer.toString(auxi)+",";
            

            if(auxIndex==0){
                auxString+=combinations0.get(n1-1);
            }
            else
            {
                auxString+=combinations0.get(auxIndex-1);
            }
            
            combinations.add(auxString);
            if(i>=auxi*n1)
            {
                auxi+=1;
            }
                
        }
        return combinations;
    }
    public ArrayList<String> combine5(int a,int b,int c,int d, int e)
    {
        int n=a*b*c*d*e;
        int n1=a*b*c*d;
        int col=5;
        
        ArrayList<String> combinations0=combine4(a,b,c,d);
        ArrayList<String> combinations=new ArrayList<>();
        int auxi=1;
        String auxString;
        
        
        for (int i = 1; i <=n; i++) {
            int auxIndex=i%(n1);
            
            auxString=Integer.toString(col)+","+Integer.toString(auxi)+",";
            

            if(auxIndex==0){
                auxString+=combinations0.get(n1-1);
            }
            else
            {
                auxString+=combinations0.get(auxIndex-1);
            }
            
            combinations.add(auxString);
            if(i>=auxi*n1)
            {
                auxi+=1;
            }
                
        }
        return combinations;
    }
    public ArrayList<String> combine6(int a,int b,int c,int d, int e, int f)
    {
        int n=a*b*c*d*e*f;
        int n1=a*b*c*d*e;
        int col=6;
        
        ArrayList<String> combinations0=combine5(a,b,c,d,e);
        ArrayList<String> combinations=new ArrayList<>();
        int auxi=1;
        String auxString;
        
        
        for (int i = 1; i <=n; i++) {
            int auxIndex=i%(n1);
            
            auxString=Integer.toString(col)+","+Integer.toString(auxi)+",";
            

            if(auxIndex==0){
                auxString+=combinations0.get(n1-1);
            }
            else
            {
                auxString+=combinations0.get(auxIndex-1);
            }
            
            combinations.add(auxString);
            if(i>=auxi*n1)
            {
                auxi+=1;
            }
                
        }
        return combinations;
    }
    public ArrayList<String> combine7(int a,int b,int c,int d, int e, int f,int g)
    {
        int n=a*b*c*d*e*f*g;
        int n1=a*b*c*d*e*f;
        int col=7;
        ArrayList<String> combinations0=combine6(a,b,c,d,e,f);
        
        
        ArrayList<String> combinations=new ArrayList<>();
        int auxi=1;
        String auxString;
        
        
        for (int i = 1; i <=n; i++) {
            int auxIndex=i%(n1);
            
            auxString=Integer.toString(col)+","+Integer.toString(auxi)+",";
            

            if(auxIndex==0){
                auxString+=combinations0.get(n1-1);
            }
            else
            {
                auxString+=combinations0.get(auxIndex-1);
            }
            
            combinations.add(auxString);
            if(i>=auxi*n1)
            {
                auxi+=1;
            }
                
        }
        return combinations;
    }
    
    /**
     * Do the combinations between nC2 
     * 
    **/
    public ArrayList<String> nC2(int n)
    {
        
        int a=1;
        int b=2;
        ArrayList<String> comb=new ArrayList<>();
        String auxComb;
        
        for (int i = 0; i<(n-1)*n/2;i++) {
            auxComb=Integer.toString(b)+","+Integer.toString(a);
            comb.add(auxComb);
            if(a+1==b)
            {
                b++;
                a=1;
                continue;
            }
                a++;
        }
        return comb;
    }
}
