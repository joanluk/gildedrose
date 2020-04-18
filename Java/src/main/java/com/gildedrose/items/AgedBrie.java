package com.gildedrose.items;

import com.gildedrose.GildedRoseConstant;

/**
 * @author Arquitectura
 */
public final class AgedBrie extends BaseItem {

    private static final String AGED_BRIE_NAME = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE_NAME, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellin();
        decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality > GildedRoseConstant.QUALITY_THRESHOLD_MAX) {
            quality --;
        }
        if ((sellIn < GildedRoseConstant.SELLIN_THREDHOLD_MIN) &&
                (quality < GildedRoseConstant.QUALITY_THRESHOLD_MAX)) {
            quality ++;
        }
        if (quality < GildedRoseConstant.QUALITY_THRESHOLD_MAX) {
            quality++;
        }
    }

}
