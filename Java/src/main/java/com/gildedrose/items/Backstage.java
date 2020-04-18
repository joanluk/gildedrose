package com.gildedrose.items;

import com.gildedrose.GildedRoseConstant;

/**
 * @author Arquitectura
 */
public final class Backstage extends BaseItem {

    public static final int TEN_DAYS_TO_EVENT = 11;
    public static final int FIVE_DAYS_TO_EVENT = 6;
    public static final int DAY_EVENT = 0;
    private static final String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE_NAME, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseSellin();
        increaseQuality();
    }

    private void increaseQuality() {
        if (quality < GildedRoseConstant.QUALITY_THRESHOLD_MAX) {
            quality++;
        }
        if ((sellIn < TEN_DAYS_TO_EVENT) && (quality < GildedRoseConstant.QUALITY_THRESHOLD_MAX)) {
            quality++;
        }

        if ((quality < FIVE_DAYS_TO_EVENT) && (quality < GildedRoseConstant.QUALITY_THRESHOLD_MAX)) {
            quality++;
        }

        if (sellIn < DAY_EVENT) {
            quality = 0;
        }

    }
}
