package com.yulin.pattern.adapter;

/**
 * The Captain use {@link RowingBoat} to sail.
 * This is the client in the pattern.
 * */
public class Captain {

    private RowingBoat rowingBoat;

    public Captain() {}

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }

}
