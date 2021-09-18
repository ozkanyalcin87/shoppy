package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartEntry> entryList;
    private Double totalAmount;


    public List<CartEntry> getEntryList() {
        return entryList;
    }

    public void setEntryList(List<CartEntry> entryList) {
        this.entryList = entryList;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addToCart(Product p, Integer qty){
        if(this.entryList == null){
            this.entryList = new ArrayList<>();
        }

        this.entryList.add(new CartEntry(p, qty));
        cartCalculate();
    }

    public void cartCalculate(){
        this.totalAmount = 0d;
        for (CartEntry e : this.entryList){
           this.totalAmount += e.getTotalAmount();
        }
    }
}
