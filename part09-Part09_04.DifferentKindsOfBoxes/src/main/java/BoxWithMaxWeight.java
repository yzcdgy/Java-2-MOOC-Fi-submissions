
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
public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item){
        if(item.getWeight() <= this.capacity){
            this.items.add(item);
            this.capacity -= item.getWeight();
        }
    }
    
    public boolean isInBox(Item item){
        if (this.items.contains(item)){
            return true;
        }
        return false;
    }
}
