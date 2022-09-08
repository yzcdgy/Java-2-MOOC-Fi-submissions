
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
public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> contents;
    
    public Box(double weight){
        this.maxWeight = weight;
        this.contents = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(item.weight() + this.weight() <= this.maxWeight){
            this.contents.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        for (Packable item : this.contents){
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }
}
