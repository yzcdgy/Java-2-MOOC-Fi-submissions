
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class Herd implements Movable{
    private ArrayList<Movable> organisms;
    
    public Herd(){
        this.organisms = new ArrayList<>();
    }
    
    public String toString(){
        String temp = "";
        for(Movable org : this.organisms){
            temp += org.toString() + "\n";
        }
        return temp;
    }
    
    public void addToHerd(Movable movable){
        this.organisms.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable org : this.organisms){
            org.move(dx, dy);
        }
    }
    
}
