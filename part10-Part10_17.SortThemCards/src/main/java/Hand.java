
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yz
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream().forEach(s -> System.out.println(s));
    }

    public void sort() {
        Collections.sort(this.cards);
    }
    
    public void sortBySuit(){
        SortBySuit sortBySuiter = new SortBySuit();
        Collections.sort(this.cards, sortBySuiter);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = 0;
        int sum2 = 0;
        
        for(Card card : this.cards){
            sum1 += card.getValue();
        }
        for(Card card : o.cards){
            sum2 += card.getValue();
        }
        return sum1 - sum2;
    }
}
