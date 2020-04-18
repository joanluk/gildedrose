package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * @author Arquitectura
 */
public abstract class BaseItem extends Item {

    public BaseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void update();


    protected void decreaseSellin() {
        sellIn --;
    }

}
