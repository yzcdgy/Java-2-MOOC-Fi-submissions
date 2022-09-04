
import java.util.ArrayList;
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (this.storage.containsKey(unit)) {
            this.storage.get(unit).add(item);
            return;
        }
        this.storage.put(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.storage.containsKey(storageUnit) || this.storage.get(storageUnit).isEmpty()) {
            return new ArrayList<>();
        }

        return (this.storage.get(storageUnit));
    }
    
    public void remove(String storageUnit, String item){
        this.storage.get(storageUnit).remove(item);
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String key : this.storage.keySet()){
            units.add(key);
        }
        return units;
    }

}
