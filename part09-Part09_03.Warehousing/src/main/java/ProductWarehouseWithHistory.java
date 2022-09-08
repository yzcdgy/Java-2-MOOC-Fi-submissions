/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yz
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        this.setBalance(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.history.add(this.getBalance() + amount);
            this.setBalance(this.getBalance() + amount);
        } else {
            this.setBalance(this.getCapacity());
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.getBalance()) {
            double allThatWeCan = this.getBalance();
            this.history.add(0.0);
            this.setBalance(0.0);
            return allThatWeCan;
        }
        this.history.add(this.getBalance() - amount);
        this.setBalance(this.getBalance() - amount);
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history);
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
