package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> products = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product){
        if(products.containsKey(product)) {
            return this.products.get(product);}
        else{
            return -99;
        }
    }

    public int stock(String product) {
        return this.stocks.get(product);
    }

    public boolean take(String product){
        if (this.stocks.containsKey(product)){
            int temp=this.stocks.get(product);
            temp--;
            this.stocks.put(product,temp);
            return true;
        }
        else
            return false;
    }

    public Set<String> products(){
        return products.keySet();
    }


}
