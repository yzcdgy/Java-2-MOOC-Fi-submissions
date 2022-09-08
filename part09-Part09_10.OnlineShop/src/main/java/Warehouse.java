
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.price.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        return this.price.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if (!this.stock.containsKey(product)){
            return false;
        }
        if (this.stock.get(product) > 0){
            this.stock.put(product, this.stock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.price.keySet();
    }
}
