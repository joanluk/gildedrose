package com.gildedrose.items;

import com.gildedrose.GildedRoseConstant;

/**
 * @author Arquitectura
 */
public final class Dexterity extends BaseItem {

    private static final String DEXTERITY_NAME = "+5 Dexterity Vest";

    public Dexterity(int sellIn, int quality) {
        super(DEXTERITY_NAME, sellIn, quality);
    }

    @Override
    public void update() {
        decreaseQuality();
        decreaseSellin();
    }

    private void decreaseQuality() {
        if (quality > GildedRoseConstant.SELLIN_THREDHOLD_MIN) {
            quality--;
        }
        if ((sellIn < GildedRoseConstant.SELLIN_THREDHOLD_MIN) && (quality > GildedRoseConstant.QUALITY_THRESHOLD_MIN)) {
            quality--;
        }
    }
}
