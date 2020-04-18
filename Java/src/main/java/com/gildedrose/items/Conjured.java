package com.gildedrose.items;

import com.gildedrose.GildedRoseConstant;

/**
 * @author Arquitectura
 */
public final class Conjured extends BaseItem {

    private static final String CONJURED_NAME = "Conjured Mana Cake";
    public Conjured(int sellIn, int quality) {
        super(CONJURED_NAME, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellin();
        decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality > GildedRoseConstant.QUALITY_THRESHOLD_MIN) {
            quality = quality - 2;
        }
    }

}
