
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
public class OneItemBox extends Box {
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
        }
    }

    public boolean isInBox(Item item){
        if (this.items.contains(item)){
            return true;
        }
        return false;
    }
}
