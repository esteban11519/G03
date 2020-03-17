/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.dayAndHour;
import data.information;
import data.subject;
import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class comparisons {

    public static combine comb;
    public static  ArrayList<String> repeatedDays; 
   
    
    
    
    public ArrayList<information> subject2(ArrayList<subject> lisSub)
    {
        comb=new combine();
        ArrayList<information> auxListInformation= new ArrayList<>();
        
        
        ArrayList<information> infa=lisSub.get(0).getInformation();
        ArrayList<information> infb=lisSub.get(1).getInformation();
        int indexa=3;
        int indexb=1;
       
        int auxIndex11;
        int auxIndex22;
        

        ArrayList<String> combinations=comb.combine2(infa.size(),infb.size());
        String[] auxCombinations;
   
        
        for (int i = 0; i < combinations.size(); i++) {
            auxCombinations=combinations.get(i).split(",");
            boolean aux;
            
               auxIndex11=Integer.parseInt(auxCombinations[indexa])-1;
               auxIndex22=Integer.parseInt(auxCombinations[indexb])-1;
        
               
               aux=isEqualInformation(infa.get(auxIndex11),infb.get(auxIndex22));
               if(!aux)
               {
                   auxListInformation.add(infa.get(auxIndex11));
                   auxListInformation.add(infb.get(auxIndex22));
                   
               }
               
               
        }
        
        
        
        return auxListInformation;
    }
    
    public ArrayList<information> subject3(ArrayList<subject> lisSub)
    {
        comb=new combine();
        ArrayList<information> lastListInformation= new ArrayList<>();
        
        ArrayList<information> infa=lisSub.get(0).getInformation();
        ArrayList<information> infb=lisSub.get(1).getInformation();
        ArrayList<information> infc=lisSub.get(2).getInformation();
        ArrayList<information> infabc=new ArrayList<>();
        
        int indexa=5;
        int indexb=3;
        int indexc=1;
       
        int auxIndexa;
        int auxIndexb;
        int auxIndexc;
        int n=lisSub.size();
        
        ArrayList<String> combinations=comb.combine3(infa.size(),infb.size(),
                infc.size());
        ArrayList<String> n3C2=comb.nC2(n);
        String[] auxCombinations;

        for (int i = 0; i < combinations.size(); i++) {
            auxCombinations=combinations.get(i).split(",");
            
            
               auxIndexa=Integer.parseInt(auxCombinations[indexa])-1;
               auxIndexb=Integer.parseInt(auxCombinations[indexb])-1;
               auxIndexc=Integer.parseInt(auxCombinations[indexc])-1;
               
               infabc.add(infa.get(auxIndexa));
               infabc.add(infb.get(auxIndexb));
               infabc.add(infc.get(auxIndexc));

            lastListInformation.addAll(myNC2(n3C2,infabc));
            infabc.clear();
               
        }

        return lastListInformation;
    }
    
    public ArrayList<information> subject4(ArrayList<subject> lisSub)
    {
        comb=new combine();
        ArrayList<information> lastListInformation= new ArrayList<>();
        
        ArrayList<information> infa=lisSub.get(0).getInformation();
        ArrayList<information> infb=lisSub.get(1).getInformation();
        ArrayList<information> infc=lisSub.get(2).getInformation();
        ArrayList<information> infd=lisSub.get(3).getInformation();
        
        ArrayList<information> allInf=new ArrayList<>();
        
        int indexa=7;
        int indexb=5;
        int indexc=3;
        int indexd=1;
       
        int auxIndexa;
        int auxIndexb;
        int auxIndexc;
        int auxIndexd;
        
        int n=lisSub.size();
        
        ArrayList<String> combinations=comb.combine4(infa.size(),infb.size(),
                infc.size(),infd.size());
        
        ArrayList<String> nC2=comb.nC2(n);
        String[] arrayCombinations;
      
        for (int i = 0; i < combinations.size(); i++) {
            arrayCombinations=combinations.get(i).split(",");
            
            
               auxIndexa=Integer.parseInt(arrayCombinations[indexa])-1;
               auxIndexb=Integer.parseInt(arrayCombinations[indexb])-1;
               auxIndexc=Integer.parseInt(arrayCombinations[indexc])-1;
               auxIndexd=Integer.parseInt(arrayCombinations[indexd])-1;
               
               allInf.add(infa.get(auxIndexa));
               allInf.add(infb.get(auxIndexb));
               allInf.add(infc.get(auxIndexc));
               allInf.add(infd.get(auxIndexd));

            lastListInformation.addAll(myNC2(nC2,allInf));
            
          
            
            allInf.clear();
               
        }

        return lastListInformation;
    }
    
    public ArrayList<information> subject5(ArrayList<subject> lisSub)
    {
        comb=new combine();
        ArrayList<information> lastListInformation= new ArrayList<>();
        
        ArrayList<information> infa=lisSub.get(0).getInformation();
        ArrayList<information> infb=lisSub.get(1).getInformation();
        ArrayList<information> infc=lisSub.get(2).getInformation();
        ArrayList<information> infd=lisSub.get(3).getInformation();
        ArrayList<information> infe=lisSub.get(4).getInformation();
        
        ArrayList<information> allInf=new ArrayList<>();
        
        int indexa=9;
        int indexb=indexa-2;
        int indexc=indexb-2;
        int indexd=indexc-2;
        int indexe=indexd-2;
       
        int auxIndexa;
        int auxIndexb;
        int auxIndexc;
        int auxIndexd;
        int auxIndexe;
        
        int n=lisSub.size();
        
        ArrayList<String> combinations=comb.combine5(infa.size(),infb.size(),
                infc.size(),infd.size(),infe.size());
        
        ArrayList<String> nC2=comb.nC2(n);
        String[] arrayCombinations;
      
        for (int i = 0; i < combinations.size(); i++) {
            arrayCombinations=combinations.get(i).split(",");
            
            
               auxIndexa=Integer.parseInt(arrayCombinations[indexa])-1;
               auxIndexb=Integer.parseInt(arrayCombinations[indexb])-1;
               auxIndexc=Integer.parseInt(arrayCombinations[indexc])-1;
               auxIndexd=Integer.parseInt(arrayCombinations[indexd])-1;
               auxIndexe=Integer.parseInt(arrayCombinations[indexe])-1;
               
               allInf.add(infa.get(auxIndexa));
               allInf.add(infb.get(auxIndexb));
               allInf.add(infc.get(auxIndexc));
               allInf.add(infd.get(auxIndexd));
               allInf.add(infe.get(auxIndexe));

            lastListInformation.addAll(myNC2(nC2,allInf));
            
          
            
            allInf.clear();
               
        }

        return lastListInformation;
    }
    
    public ArrayList<information> subject6(ArrayList<subject> lisSub)
    {
        comb=new combine();
        ArrayList<information> lastListInformation= new ArrayList<>();
        
        ArrayList<information> infa=lisSub.get(0).getInformation();
        ArrayList<information> infb=lisSub.get(1).getInformation();
        ArrayList<information> infc=lisSub.get(2).getInformation();
        ArrayList<information> infd=lisSub.get(3).getInformation();
        ArrayList<information> infe=lisSub.get(4).getInformation();
        ArrayList<information> inff=lisSub.get(5).getInformation();
        
        ArrayList<information> allInf=new ArrayList<>();
        
        int indexa=11;
        int indexb=indexa-2;
        int indexc=indexb-2;
        int indexd=indexc-2;
        int indexe=indexd-2;
        int indexf=indexe-2;
        
        int auxIndexa;
        int auxIndexb;
        int auxIndexc;
        int auxIndexd;
        int auxIndexe;
        int auxIndexf;
        
        int n=lisSub.size();
        
        ArrayList<String> combinations=comb.combine6(infa.size(),infb.size(),
                infc.size(),infd.size(),infe.size(),inff.size());
        
        ArrayList<String> nC2=comb.nC2(n);
        String[] arrayCombinations;
      
        for (int i = 0; i < combinations.size(); i++) {
            arrayCombinations=combinations.get(i).split(",");
            
            
               auxIndexa=Integer.parseInt(arrayCombinations[indexa])-1;
               auxIndexb=Integer.parseInt(arrayCombinations[indexb])-1;
               auxIndexc=Integer.parseInt(arrayCombinations[indexc])-1;
               auxIndexd=Integer.parseInt(arrayCombinations[indexd])-1;
               auxIndexe=Integer.parseInt(arrayCombinations[indexe])-1;
               auxIndexf=Integer.parseInt(arrayCombinations[indexf])-1;
               
               allInf.add(infa.get(auxIndexa));
               allInf.add(infb.get(auxIndexb));
               allInf.add(infc.get(auxIndexc));
               allInf.add(infd.get(auxIndexd));
               allInf.add(infe.get(auxIndexe));
               allInf.add(inff.get(auxIndexf));
               

            lastListInformation.addAll(myNC2(nC2,allInf));
            
          
            
            allInf.clear();
               
        }

        return lastListInformation;
    }
    public ArrayList<information> subject7(ArrayList<subject> lisSub)
    {
        comb=new combine();
        ArrayList<information> lastListInformation= new ArrayList<>();
        
        ArrayList<information> infa=lisSub.get(0).getInformation();
        ArrayList<information> infb=lisSub.get(1).getInformation();
        ArrayList<information> infc=lisSub.get(2).getInformation();
        ArrayList<information> infd=lisSub.get(3).getInformation();
        ArrayList<information> infe=lisSub.get(4).getInformation();
        ArrayList<information> inff=lisSub.get(5).getInformation();
        ArrayList<information> infg=lisSub.get(6).getInformation();
        
        ArrayList<information> allInf=new ArrayList<>();
        
        int indexa=13;
        int indexb=indexa-2;
        int indexc=indexb-2;
        int indexd=indexc-2;
        int indexe=indexd-2;
        int indexf=indexe-2;
        int indexg=indexf-2;
        
        int auxIndexa;
        int auxIndexb;
        int auxIndexc;
        int auxIndexd;
        int auxIndexe;
        int auxIndexf;
        int auxIndexg;
        
        int n=lisSub.size();
        
        ArrayList<String> combinations=comb.combine7(infa.size(),infb.size(),
                infc.size(),infd.size(),infe.size(),inff.size(),infg.size());
        
        ArrayList<String> nC2=comb.nC2(n);
        String[] arrayCombinations;
      
        for (int i = 0; i < combinations.size(); i++) {
            arrayCombinations=combinations.get(i).split(",");
            
            
               auxIndexa=Integer.parseInt(arrayCombinations[indexa])-1;
               auxIndexb=Integer.parseInt(arrayCombinations[indexb])-1;
               auxIndexc=Integer.parseInt(arrayCombinations[indexc])-1;
               auxIndexd=Integer.parseInt(arrayCombinations[indexd])-1;
               auxIndexe=Integer.parseInt(arrayCombinations[indexe])-1;
               auxIndexf=Integer.parseInt(arrayCombinations[indexf])-1;
               auxIndexg=Integer.parseInt(arrayCombinations[indexg])-1;
               
               allInf.add(infa.get(auxIndexa));
               allInf.add(infb.get(auxIndexb));
               allInf.add(infc.get(auxIndexc));
               allInf.add(infd.get(auxIndexd));
               allInf.add(infe.get(auxIndexe));
               allInf.add(inff.get(auxIndexf));
               allInf.add(infg.get(auxIndexg));
               

            lastListInformation.addAll(myNC2(nC2,allInf));
            
          
            
            allInf.clear();
               
        }

        return lastListInformation;
    }

    
    public ArrayList<information> myNC2(ArrayList<String> nC2,ArrayList<information> allInf)
    {
        boolean aux;
        boolean aux2=true;
        String[] arrayNC2;
        ArrayList<information> auxListInformation= new ArrayList<>();
        
        
        for (int j = 0; j < nC2.size(); j++) {
                
                arrayNC2=nC2.get(j).split(",");
                int index1=Integer.parseInt(arrayNC2[0])-1;
                int index2=Integer.parseInt(arrayNC2[1])-1;
               
               aux=isEqualInformation(allInf.get(index1),allInf.get(index2));
               aux2=aux2&&!aux;
               
                
               if(aux2)
               {
                   auxListInformation.add(allInf.get(index1));
                   auxListInformation.add(allInf.get(index2));
                   
               } 
               
               if(!aux2) auxListInformation.clear();
            }
        return uniqueInformations(auxListInformation);
    }
    
    public boolean isEqualInformation(information a,information b)
    {
         int auxIndex11;
        int auxIndex22;
        int indexa=3;
        int indexb=1;
        
        
        ArrayList<String> combinations;
        combinations=comb.combine2(a.getDaysHours().size(),b.getDaysHours().size());
        String[] auxCombinations;
        
        for (int i = 0; i < combinations.size(); i++) {
            auxCombinations=combinations.get(i).split(",");
            
            auxIndex11=Integer.parseInt(auxCombinations[indexa])-1;
            auxIndex22=Integer.parseInt(auxCombinations[indexb])-1;
            
            boolean auxBoolean= 
            isEqualDaysAndHours(a.getDaysHours().get(auxIndex11),
                    b.getDaysHours().get(auxIndex22));
                    
            if(auxBoolean) return true;
            
        }
 
        return false;
    }
    
    public boolean isEqualDaysAndHours(dayAndHour a,dayAndHour b)
    {
        ArrayList<String> aa=new ArrayList<>();
        ArrayList<String> bb=new ArrayList<>();
        
        aa.add(a.getDay());
        bb.add(b.getDay());
        
        if(isFree(aa,bb)) return false;
        else if(!isFree(a.getHours(),b.getHours())) return true;
        return false;
    }
    
  
    
    
    public boolean isFree(ArrayList<String> a,ArrayList<String> b)
    {
        
        repeatedDays=new ArrayList<>();
        boolean aa=true;
                
        for (int i = 0; i < a.size(); i++) {
            if(!isFree(a.get(i),b))
            {
                aa=false;
            }
           
        }
        return aa;
    }
    public boolean isFree(String a,ArrayList<String> b)
    {
        boolean aa=true;
        for (int i = 0; i < b.size(); i++) {
            if(a.equals(b.get(i)))
            {
                repeatedDays.add(a);
                aa=false;
            }
        }
        
        return aa;
    }
    
    public ArrayList<information> uniqueInformations(ArrayList<information> lisInf)
    {
        boolean aux=false;
        while(!aux)
        {
            for (int i = 0; i < lisInf.size(); i++) {
                for (int j=i+1; j < lisInf.size(); j++) {
                    if(lisInf.get(i).equals(lisInf.get(j)))
                    {
                        lisInf.remove(j);
                    }
                }
            
            }
          aux=isUniqueInformations(lisInf);
        }
        System.out.println(lisInf.size());
        return lisInf;
        
    }
    public boolean isUniqueInformations(ArrayList<information> lisInf)
    {
        for (int i = 0; i < lisInf.size(); i++) {
                for (int j=i+1; j < lisInf.size(); j++) {
                    if(lisInf.get(i).equals(lisInf.get(j)))
                    {
                        return false;

                    }
                }
            
            }
        return true;
    }
}
