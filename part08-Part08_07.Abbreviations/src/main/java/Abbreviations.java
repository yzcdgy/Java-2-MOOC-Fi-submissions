
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class Abbreviations {
    private HashMap<String, String> list;
    
    public Abbreviations(){
        this.list = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.list.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.list.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return this.list.get(abbreviation);
    }
}
