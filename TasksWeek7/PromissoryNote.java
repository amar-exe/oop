package com.company;

import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String,Double> note;

    public PromissoryNote() {
        this.note=new HashMap<String,Double>();
    };

    public double howMuchIsDebt(String whose) {
        if(this.note.containsKey(whose)) return this.note.get(whose);
        return 0;
    }

    public void setLoan(String toWhom, double value) {
        this.note.put(toWhom,value);
    }
}
