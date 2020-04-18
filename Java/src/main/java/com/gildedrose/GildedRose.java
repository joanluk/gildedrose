package com.gildedrose;

import java.util.Arrays;

import com.gildedrose.items.BaseItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.asList(items).stream().map((item -> (BaseItem) item)).forEach(BaseItem::update);
    }
}