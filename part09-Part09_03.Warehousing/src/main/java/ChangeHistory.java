
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public double maxValue() {
        double max = Double.MIN_VALUE;
        for (double value : this.history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        for (double value : this.history) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : this.history) {
            sum += value;
        }
        return sum / this.history.size();

    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

}
