package com.yulin.pattern.adapter;

/**
 * Adapter class. Adapts the interface of the device ({@link FishingBoat}) to ({@link RowingBoat}
 * interface expected by the client ({@link Captain}))
 * */
public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    public void row() {
        boat.sail();
    }

}
