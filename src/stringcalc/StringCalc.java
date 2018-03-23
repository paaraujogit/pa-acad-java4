/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalc;

/**
 *
 * @author lpiedade
 */
public class StringCalc {
    private String s2, s1;

    public StringCalc() {
    }
    
    public String addingString(String s2, String s1){
        return s2+s1;
    }
    public String biggestString(String s2, String s1){
       if(s2.length()== s1.length()){
           return "They are the same";
       }else if (s2.length()>=s1.length()){
           return s2;
       }else{
           return s1;
       }
       
    }
    public String addingStringsWithSpace(String s1, String s2){
        return s1+" "+s2;
    }
    
    public String repetingNTimesString(String s1, Integer nTimes){
        
        String result ="";
        
        while(nTimes>0){
            result=result +s1;
            nTimes--;
        }
         return result;  
   }
    
    public Boolean compareStringsInside(String s1, String s2){
        return s1.equals(s2);
    }
    public String stringWithAnEmotion(String s1, Boolean emotion){
        if(emotion){
            return s1 + " " + ":)";
        }else{
            return s1 + " " + ":(";
            
        }
    } 
}

