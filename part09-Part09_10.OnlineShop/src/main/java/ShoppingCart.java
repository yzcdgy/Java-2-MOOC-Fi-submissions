
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class ShoppingCart {
    private List<Item> contents;
    
    public ShoppingCart(){
        this.contents = new ArrayList<>();
    }
    
    public void add(String product, int price){
        Item tempItem = new Item(product, 1, price);      
        if(this.contents.contains(tempItem)){
            this.contents.get(this.contents.indexOf(tempItem)).increaseQuantity();
            return;
        }
        this.contents.add(new Item(product, 1, price));
    }
    
    public int price(){
        int price = 0;
        for (Item item : this.contents){
            price += item.price();
        }
        return price;
    }
    
    public void print(){
        for (Item item : this.contents){
            System.out.println(item);
        }
    }
}
