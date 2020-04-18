package com.gildedrose.items;

import com.gildedrose.GildedRoseConstant;

/**
 * @author Arquitectura
 */
public final class Sulfuras extends BaseItem {

    private static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS_NAME, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality < GildedRoseConstant.QUALITY_THRESHOLD_MAX) {
            quality --;
        }
    }
}
