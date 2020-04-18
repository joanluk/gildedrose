package com.gildedrose.items;

import com.gildedrose.GildedRoseConstant;

/**
 * @author Arquitectura
 */
public final class Elixir extends BaseItem {

    private static final String ELIXIR_NAME = "Elixir of the Mongoose";

    public Elixir(int sellIn, int quality) {
        super(ELIXIR_NAME, sellIn, quality);
    }

    @Override
    public void update() {
      decreaseSellin();
      decreaseQuality();
    }

    private void decreaseQuality() {
        if (quality > GildedRoseConstant.QUALITY_THRESHOLD_MIN) {
            quality --;
        }
        if ((sellIn < GildedRoseConstant.SELLIN_THREDHOLD_MIN) && (quality > GildedRoseConstant.QUALITY_THRESHOLD_MIN)) {
            quality --;
        }
    }
}
